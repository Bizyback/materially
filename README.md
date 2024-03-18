<p align="center"><img width=100% src="/.github/images/materially.png" alt="Materially"></p>

# Materially
Reusable `Material3` components for Mobile & Tv

## Why?
Currently in order to use `Material3` components for both mobile and tv you'll have to add checks for 
most of them. Materially merges mobile and tv `Material3` components into one.
### Example
#### Material3
- dependencies
  
  |               Mobile                |           Television           |
  |:-----------------------------------:|:------------------------------:|
  | `androidx.compose.material3.Button` | `androidx.tv.material3.Button` |

- usage
    ```kotlin
    composable {
        ...
        val isTv = // add your check here
        if (isTv)
            androidx.tv.material3.Button(...)
        else
            androidx.compose.material3.Button(...)
        ...
    }
    ```
#### Materially
- dependency
  
  |                Mobile & Television                |
  |:-------------------------------------------------:|
  | `com.bizyback.materially.components.atoms.Button` |

- usage
    ```kotlin
    composable {
        Button(...)
    }
    ```
#### Sample
|                                      mobile                                      |                                      tablet                                      |                                     telly                                      |
|:--------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------:|:------------------------------------------------------------------------------:|
|      <img src="/.github/images/demo/mobile.png" hspace="2" alt="mobile" />       |      <img src="/.github/images/demo/tablet.png" hspace="2" alt="tablet" />       |      <img src="/.github/images/demo/telly.png" hspace="2" alt="telly" />       |

## Installation

* Install `jitpack`

Find `settings.gradle.kts` in the root project folder and add :
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") } // add this line
    }
}
```
* Add `Materially` Dependency

In your app module find `build.gradle.kts` and add :

```kotlin
  implementation("com.github.bizyback:materially:$version")
```

* Sync gradle and proceed use the library

## Usage
- Change `MaterialTheme` to  `MateriallyTheme`
  ```kotlin
  @Composable
  fun MateriallyTheme(
      shapes: MateriallyShapes = materiallyShapes(), // to customize shapes
      padding: MateriallyPadding = materiallyPadding(), // to customize padding sizes
      typography: MateriallyTypography = materiallyTypography(), // to customize typography
      colorScheme: MateriallyColorScheme = materiallyColorScheme(), // to customize color scheme
      content: @Composable () -> Unit // pass your content
  ): Unit
  ```
  