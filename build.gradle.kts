plugins {
    id("java")
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "org.project"
version = "0.0.1-ALPHA"

repositories {
    mavenCentral()
}

/**
 * Spring
 */
dependencies {
    implementation(group = "org.springframework.boot", name = "spring-boot-starter-web")
    implementation(group = "org.springframework.boot", name = "spring-boot-starter-data-jpa")
}

/**
 * Lombok
 */
dependencies {
    implementation("org.projectlombok:lombok:1.18.44")
    testImplementation("org.projectlombok:lombok:1.18.44")
    compileOnly("org.projectlombok:lombok:1.18.44")
    runtimeOnly("org.projectlombok:lombok:1.18.44")
}

/**
 * Other
 */
dependencies {
    // Source: https://mvnrepository.com/artifact/org.postgresql/postgresql
    implementation("org.postgresql:postgresql:42.7.10")

    // Source: https://mvnrepository.com/artifact/log4j/log4j
    implementation("log4j:log4j:1.2.17")
}

/**
 * Test
 */
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}