package ee.bcs.valiit.solution.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleBookHibernateService {
    @Autowired
    private SampleBookRepository bookRepository;

    public List<SampleBookResponse> getAllBooks(String name) {
        List<SampleBook> sampleBookList = bookRepository.findAllByNameContaining(name);
        List<SampleBookResponse> responseList = new ArrayList<>();
        for (SampleBook sampleBook : sampleBookList) {
            responseList.add(new SampleBookResponse(sampleBook));
        }
        return responseList;
    }
}
