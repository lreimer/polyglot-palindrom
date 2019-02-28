plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.20")
}

repositories {
    jcenter()
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.2.1")
    testRuntime("org.slf4j:slf4j-simple:1.7.25")
}
