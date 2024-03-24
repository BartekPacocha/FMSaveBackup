import java.time.LocalDateTime;

public record FileMetadata(
        String filename,
        LocalDateTime lastModification,
        int version
) {
}
