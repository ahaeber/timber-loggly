## timber-loggly v2.0


A [Timber][2] tree for asynchronously posting log messages to [Loggly][1].

Usage
-----
1. Plant a `LogglyTree` with your [authorization token][3] from Loggly.
 ```java
 import android.app.Application;
 import com.github.tony19.timber.loggly.LogglyTree;
 import timber.log.Timber;

 public class ExampleApp extends Application {

     @Override
     public void onCreate() {
         super.onCreate();

         final String LOGGLY_TOKEN = /* your loggly token */;
         Timber.plant(new LogglyTree(LOGGLY_TOKEN));
     }
 }
 ```

2. Use Timber API to log an event via `LogglyTree`...
 ```java
 Timber.tag("foo");
 Timber.i("hello world");
 ```

Download
--------

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency

```
dependencies {
    compile 'com.github.jdsingh:timber-loggly:v2.0'
}
```

#### Gradle

```
compile 'com.github.jdsingh:timber-loggly:v2.0'
```

[1]: http://loggly.com
[2]: https://github.com/JakeWharton/timber
[3]: https://www.loggly.com/docs/customer-token-authentication-token/
