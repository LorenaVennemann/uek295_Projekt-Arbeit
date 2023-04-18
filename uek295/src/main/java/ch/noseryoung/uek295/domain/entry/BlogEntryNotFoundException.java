package ch.noseryoung.uek295.domain.entry;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BlogEntryNotFoundException extends RuntimeException {
  public BlogEntryNotFoundException(String message) {
    super(message);
  }
}