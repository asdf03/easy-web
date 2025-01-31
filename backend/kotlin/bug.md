今は以下の理由で落ちている
> Task :bootRun

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/

:: Spring Boot ::                (v3.4.1)

2025-01-30T18:45:41.448+09:00  INFO 66135 --- [  restartedMain] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 21.0.5 with PID 66135 (/home/user/source/my-projects/easy-web/backend/build/classes/kotlin/main started by user in /home/user/source/my-projects/easy-web/backend)
2025-01-30T18:45:41.450+09:00  INFO 66135 --- [  restartedMain] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2025-01-30T18:45:41.477+09:00  INFO 66135 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2025-01-30T18:45:41.477+09:00  INFO 66135 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2025-01-30T18:45:42.039+09:00  INFO 66135 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-01-30T18:45:42.046+09:00  INFO 66135 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-01-30T18:45:42.046+09:00  INFO 66135 --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.34]
2025-01-30T18:45:42.064+09:00  INFO 66135 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-01-30T18:45:42.064+09:00  INFO 66135 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 586 ms
2025-01-30T18:45:42.389+09:00  WARN 66135 --- [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'schema' defined in class path resource [com/expediagroup/graphql/server/spring/NonFederatedSchemaAutoConfiguration.class]: Failed to instantiate [graphql.schema.GraphQLSchema]: Factory method 'schema' threw exception with message: Invalid query object type - no valid queries are available.
2025-01-30T18:45:42.390+09:00  INFO 66135 --- [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-01-30T18:45:42.398+09:00  INFO 66135 --- [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-01-30T18:45:42.405+09:00 ERROR 66135 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'schema' defined in class path resource [com/expediagroup/graphql/server/spring/NonFederatedSchemaAutoConfiguration.class]: Failed to instantiate [graphql.schema.GraphQLSchema]: Factory method 'schema' threw exception with message: Invalid query object type - no valid queries are available.
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:657) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:645) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1357) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1187) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1122) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1093) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1030) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:987) ~[spring-context-6.2.1.jar:6.2.1]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.1.jar:6.2.1]
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.1.jar:3.4.1]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.4.1.jar:3.4.1]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.1.jar:3.4.1]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.1.jar:3.4.1]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.1.jar:3.4.1]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.1.jar:3.4.1]
at com.example.demo.DemoApplicationKt.main(DemoApplication.kt:13) ~[main/:na]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.4.1.jar:3.4.1]
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [graphql.schema.GraphQLSchema]: Factory method 'schema' threw exception with message: Invalid query object type - no valid queries are available.
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:199) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiateWithFactoryMethod(SimpleInstantiationStrategy.java:88) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:168) ~[spring-beans-6.2.1.jar:6.2.1]
at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-6.2.1.jar:6.2.1]
... 24 common frames omitted
Caused by: com.expediagroup.graphql.generator.exceptions.EmptyQueryTypeException: Invalid query object type - no valid queries are available.
at com.expediagroup.graphql.generator.exceptions.EmptyQueryTypeException.<clinit>(EmptyQueryTypeException.kt) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.generator.hooks.SchemaGeneratorHooks$DefaultImpls.didGenerateQueryObject(SchemaGeneratorHooks.kt:194) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.generator.hooks.NoopSchemaGeneratorHooks.didGenerateQueryObject(NoopSchemaGeneratorHooks.kt:22) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.generator.internal.types.GenerateQueryKt.generateQueries(generateQuery.kt:52) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.generator.SchemaGenerator.generateSchema(SchemaGenerator.kt:80) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.generator.SchemaGenerator.generateSchema$default(SchemaGenerator.kt:58) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.generator.ToSchemaKt.toSchema(toSchema.kt:43) ~[graphql-kotlin-schema-generator-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.server.spring.NonFederatedSchemaAutoConfiguration.schema(NonFederatedSchemaAutoConfiguration.kt:85) ~[graphql-kotlin-spring-server-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.server.spring.NonFederatedSchemaAutoConfiguration$$SpringCGLIB$$0.CGLIB$schema$0(<generated>) ~[graphql-kotlin-spring-server-8.0.0.jar:8.0.0]
at com.expediagroup.graphql.server.spring.NonFederatedSchemaAutoConfiguration$$SpringCGLIB$$FastClass$$1.invoke(<generated>) ~[graphql-kotlin-spring-server-8.0.0.jar:8.0.0]
at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:258) ~[spring-core-6.2.1.jar:6.2.1]
at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:348) ~[spring-context-6.2.1.jar:6.2.1]
at com.expediagroup.graphql.server.spring.NonFederatedSchemaAutoConfiguration$$SpringCGLIB$$0.schema(<generated>) ~[graphql-kotlin-spring-server-8.0.0.jar:8.0.0]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:171) ~[spring-beans-6.2.1.jar:6.2.1]
... 27 common frames omitted

これを解決するには、次の手順を実行してください。
1. `src/main/kotlin/com/example/demo/`ディレクトリに`Query.kt`ファイルを作成します。
2. `Query.kt`ファイルに次のコードを追加します。
```kotlin
package com.example.demo

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.annotations.GraphQLName
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class Query : Query {
    @GraphQLDescription("A simple hello world query")
    fun helloWorld(@GraphQLName("name") name: String): String = "Hello $name!"
}
```
3. アプリケーションを再起動します。
4. `http://localhost:8080/graphql`にアクセスして、GraphQLクエリを実行します。
5. `helloWorld`クエリを実行して、`Hello World!`というレスポンスが返されることを確認します。
6. 問題が解決されたら、`Query.kt`ファイルをカスタマイズして、必要なGraphQLクエリを追加します。
7. 
