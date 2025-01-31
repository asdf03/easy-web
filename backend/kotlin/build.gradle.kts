plugins {
	// 必要な Kotlin + Spring Boot プラグイン
	id("org.springframework.boot") version "3.4.1"
	id("io.spring.dependency-management") version "1.1.7"
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
}

group = "com.example"
version = "1.0-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

val graphqlVersion = "8.2.1"

dependencies {
	// Spring Boot (Web)
	implementation("org.springframework.boot:spring-boot-starter-web")

	// GraphQL Kotlin (Expedia) 9.x 系
//	implementation("com.expediagroup", "graphql-kotlin-spring-server", graphqlVersion)
//	implementation("com.expediagroup", "graphql-kotlin-schema-generator", graphqlVersion)
	implementation("com.expediagroup", "graphql-kotlin-spring-server", graphqlVersion)
	implementation("com.expediagroup", "graphql-kotlin-schema-generator", graphqlVersion)
	implementation("com.expediagroup", "graphql-kotlin-hooks-provider", graphqlVersion)
	implementation("com.graphql-java", "graphql-java-extended-scalars", "22.0")


	// Kotlin Reflection (必須)
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	// 開発用
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// テスト
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
}
