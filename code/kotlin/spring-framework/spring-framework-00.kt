@ImmutableConfigurationProperties(prefix = "dependency.updates")
@Validated
data class AppProperties(
    val locations: List&ltLocation&gt,
    val git: Git,
    val limit: Int,
    @field:NotBlank
    val cron: String,
    @field:NotBlank
    val priority: String,
    @field:NotBlank
    val dirPath: String
)

@Validated
data class Location(
    @field:NotBlank
    val project: String,
    @field:NotBlank
    val repository: String
)

@Validated
data class Git(
    @field:NotBlank
    val domain: String,
    val credentials: Credentials
)

@Validated
data class Credentials(
    @field:NotBlank
    val username: String,
    @field:NotBlank
    val password: String
)