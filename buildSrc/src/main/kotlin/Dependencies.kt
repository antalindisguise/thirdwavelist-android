import org.gradle.api.JavaVersion

object Config {
    const val minSdk = 23
    const val compileSdk = 29
    const val targetSdk = 29
    val javaVersion = JavaVersion.VERSION_1_8
}

object Versions {
    // JetBrains
    const val kotlin = "1.4.21"

    // Airbnb
    const val lottie = "3.6.0"

    // Google
    const val google_services = "4.3.5"
    const val hilt = "2.28-alpha"
    const val gson = "2.8.6"

    // Google Firebase
    const val crashlytics_gradle = "2.4.1"
    const val firebase_bom = "26.4.0"

    // Google - Jetpack
    const val nav_components = "2.3.3"
    const val appcompat = "1.2.0"
    const val constraint_layout = "2.0.4"
    const val material_design = "1.2.1"
    const val recycler_view = "1.1.0"
    const val card_view = "1.0.0"
    const val core_ktx = "1.3.2"
    const val room = "2.2.6"
    const val lifecycle = "2.2.0"
    const val espresso = "3.3.0"
    const val test_ext_junit = "1.1.2"

    // Bump Technologies
    const val glide = "4.9.0"

    // ReactiveX
    const val rxjava = "2.2.8"
    const val rxandroid = "2.1.1"

    // Square
    const val okhttp = "3.14.1"
    const val retrofit = "2.5.0"

    // JUnit Org
    const val junit = "4.13.1"
}