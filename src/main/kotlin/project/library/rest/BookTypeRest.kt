package project.library.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import project.library.entities.BookType
import project.library.repository.BookTypeRepository

@RestController
@RequestMapping("/booktype")
class BookTypeRest {

    @Autowired
    lateinit var repository: BookTypeRepository;

    @GetMapping
    public fun findAll(): ResponseEntity<List<BookType>> {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public fun findById(@PathVariable id: Long): ResponseEntity<BookType> {
        return ResponseEntity.ok(repository.findById(id).orElseThrow())
    }

    @PostMapping
    public fun insert(@RequestBody resource : BookType): ResponseEntity<BookType> {
        return ResponseEntity.ok(repository.save(resource))
    }

    @PutMapping("/{id}")
    public fun update(@RequestBody resource: BookType, @PathVariable id: Long): ResponseEntity<BookType> {
        return insert(resource)
    }

    @DeleteMapping("/{id}")
    public fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok(repository.deleteById(id));
    }
}
