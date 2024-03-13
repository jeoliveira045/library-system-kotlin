package project.library.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import project.library.entities.Book
import project.library.repository.BookRepository

@RestController
@RequestMapping("/book")
class BookRest {

    @Autowired
    lateinit var repository: BookRepository;

    @GetMapping
    public fun findAll(): ResponseEntity<List<Book>> {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public fun findById(@PathVariable id: Long): ResponseEntity<Book> {
        return ResponseEntity.ok(repository.findById(id).orElseThrow())
    }

    @PostMapping
    public fun insert(@RequestBody resource : Book): ResponseEntity<Book> {
        return ResponseEntity.ok(repository.save(resource))
    }

    @PutMapping("/{id}")
    public fun update(@RequestBody resource: Book, @PathVariable id: Long): ResponseEntity<Book> {
        return insert(resource)
    }

    @DeleteMapping("/{id}")
    public fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok(repository.deleteById(id));
    }
}
