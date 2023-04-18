package ch.noseryoung.uek295.domain.entry;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class BlogEntryService {
  private final BlogEntryRepository blogEntryRepository;

  public BlogEntryService(BlogEntryRepository blogEntryRepository) {
    this.blogEntryRepository = blogEntryRepository;
  }

  public List<BlogEntry> getAllBlogEntries() {
    log.info("all blog entries have been accessed");
    return Optional.of(blogEntryRepository.findAll()).orElseThrow(() -> new BlogEntryNotFoundException("No blog entries have been found"));
  }

  public BlogEntry getBlogEntryById(Long id) {
    log.info("blog entry with id " + id + " has been accessed");
    return blogEntryRepository.findById(id).orElseThrow(() -> new BlogEntryNotFoundException("Blog entry with id " + id + " not found"));
  }

  public void addBlogEntry(BlogEntry blogEntry) {
    blogEntryRepository.save(blogEntry);
    log.info("blog entry with id " + blogEntry.getId() + " has been added to the database");
  }

  public void updateBlogEntry(Long id, BlogEntry updatedBlogEntry) {
    BlogEntry blogEntry = blogEntryRepository.findById(id).orElseThrow(() -> new BlogEntryNotFoundException("Blog entry with id " + id + " not found"));
    blogEntry.setAuthor(updatedBlogEntry.getAuthor());
    blogEntry.setDate(updatedBlogEntry.getDate());
    blogEntry.setText(updatedBlogEntry.getText());
    blogEntryRepository.save(blogEntry);
    log.info("blog entry with id " + id + " has been updated");
  }

  public void deleteBlogEntry(Long id) {
    BlogEntry blogEntry = blogEntryRepository.findById(id).orElseThrow(() -> new BlogEntryNotFoundException("Blog entry with id " + id + " not found"));
    blogEntryRepository.delete(blogEntry);
    log.info("blog entry with id " + id + " has been deleted from the database");
  }
}