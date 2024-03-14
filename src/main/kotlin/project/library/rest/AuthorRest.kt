package project.library.rest

import org.apache.coyote.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import project.library.entities.Author
import project.library.repository.AuthorRepository
import project.library.repository.specification.AuthorSpecification.Companion

@RestController
@RequestMapping("/author")
class AuthorRest {

    @Autowired
    lateinit var repository: AuthorRepository;

    @GetMapping
    fun findAll(): ResponseEntity<List<Author>>{
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/bybook/{id}")
    fun findAllByBook(@PathVariable id: Long): ResponseEntity<List<Author>>{
        return ResponseEntity.ok(repository.findAll(Companion.byId(id)))
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Author>{
        return ResponseEntity.ok(repository.findById(id).orElseThrow())
    }

    @PostMapping
    fun insert(@RequestBody resource : Author): ResponseEntity<Author>{
        return ResponseEntity.ok(repository.save(resource))
    }

    @PutMapping("/{id}")
    fun update(@RequestBody resource: Author, @PathVariable id: Long): ResponseEntity<Author>{
        return insert(resource)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok(repository.deleteById(id));
    }
}
