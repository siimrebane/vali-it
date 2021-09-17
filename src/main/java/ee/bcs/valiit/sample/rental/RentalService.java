package ee.bcs.valiit.sample.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;
    private Random random = new Random();

    public List<RentalDto> getRentals() {
        List<RentalEntity> rentalEntities = rentalRepository.getRentals();
        List<RentalDto> result = new ArrayList<>();
        for (RentalEntity rentalEntity : rentalEntities) {
            RentalDto rentalDto = new RentalDto();
            rentalDto.setFrom(rentalEntity.getFrom());
            rentalDto.setTo(rentalEntity.getTo());
            rentalDto.setCarNumber(rentalEntity.getNumber());
            rentalDto.setFullName(rentalEntity.getClientFirstName() + " " + rentalEntity.getClientLastName());
            result.add(rentalDto);
        }
        return result;
    }

    public void generateTestData(int clientCount) {
        for(int i = 0; i < clientCount; i++){
            String firstName = generateFirstName();
            String lastName = generateLastName();
            for(int j = 0; j < 3; j++){
                String generateCarNumber = generateCarNumber();
                String generatedBrand = generatedBrand();
                Integer carId = rentalRepository.saveCar(generateCarNumber, generatedBrand);
                int rentalsCount = random.nextInt(10) + 1;
                for(int k = 0; k < rentalsCount; k++){
                    rentalRepository.saveRental(carId, firstName, lastName, generateBeginDate(), LocalDate.now());
                }
            }
        }
    }

    private String generatedBrand() {
        String[] carBrands = new String[]{"Toyota", "Honda", "Mercedes"};
        return carBrands[random.nextInt(carBrands.length)];
    }

    private LocalDate generateBeginDate() {
        int something = random.nextInt(10);
        return LocalDate.now().minusDays(something);
    }

    private String generateLastName() {
        return "LastName" + random.nextInt();
    }

    private String generateFirstName() {
        return "firstName" + random.nextInt();
    }

    private String generateCarNumber() {
        return String.valueOf(random.nextInt());
    }
}
