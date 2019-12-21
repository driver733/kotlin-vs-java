@ImmutableConfigurationProperties(prefix = "dependency.updates")
@Validated
@RequiredArgsConstructor // Lombok
@Data // Lombok
public class AppProperties {
    private final List&ltLocation&gt location;
    private final Git git;
    private final Integer limit;
    @NotBlank
    private final String cron;
    @NotBlank
    private final String priority;
    @NotBlank
    private final String dirPath;
}

@Validated
@Data // Lombok
public class Location {
    @NotBlank
    private final String project;
    @NotBlank
    private final String repository;
}

@Validated
@Data // Lombok
public class Git {
    @NotBlank
    private final String domain;
    private final Credentials credentials;
}

@Validated
@Data // Lombok
public class Credentials {
    @NotBlank
    private final String username;
    @NotBlank
    private final String password;
}