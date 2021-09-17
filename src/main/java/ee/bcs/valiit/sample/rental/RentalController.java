package ee.bcs.valiit.sample.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RentalController {
    @Autowired
    private RentalService rentalService;

    @GetMapping("rentals")
    public List<RentalDto> getRentals() {
        return rentalService.getRentals();
    }

    @GetMapping("rentals/generateData")
    public void generate(@RequestParam("i") int clientCount) {
        rentalService.generateTestData(clientCount);
    }
}
