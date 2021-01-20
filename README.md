# Kotlin-native for iOS

Used an Example project for Kotlin/Native from as a base
https://kotlinlang.org/docs/tutorials/native/basic-kotlin-native-app.html

Use the following command to compile and run the application:
```
./gradlew linkNative
```

The nativelibs will be located in:
```
build/bin/native
```

Kotlin code in: 
```
src/nativeMain/kotlin
```

build.gradle.kts holds main gradle configuration, modify for different native builds.

## License
MIT. See the `LICENSE` file for the full text

