import com.example.demo.domain.Hoge
import org.springframework.stereotype.Component
import javax.management.Query

data class GraphQLConfigOutput(
    val hoge: Hoge
)

@Component
class GraphQLConfigQuery() : Query {
    suspend fun getGraphQLConfig(): GraphQLConfigOutput {
        return Hoge("hoge")
    }
}