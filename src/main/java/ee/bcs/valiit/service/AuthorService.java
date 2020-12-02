package ee.bcs.valiit.service;

import ee.bcs.valiit.repository3.Author;
import ee.bcs.valiit.repository3.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Transactional(readOnly = true)
    public Author getById(Integer id) {
        Optional<Author> authorOp = authorRepository.findById(id);
        Author author = authorOp.orElseThrow(() -> new RuntimeException("juhtus viga"));
        authorRepository.niceShortNameForFunction("midagi");
        return author;
    }

    public void test(){
        authorRepository.niceShortNameForFunction();
    }
}
