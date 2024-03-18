<p align="center"><img width=100% src="/.github/images/materially.png" alt="Materially"></p>

# Materially
Reusable `Material3` components for Mobile & Tv

## Why?
Currently in order to use `Material3` components for both mobile and tv you'll have to add checks for 
most of them. Materially merges mobile and tv `Material3` components into one.
### Example
#### Current
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
|                                      mobile                                       |                                      tablet                                       |                                      telly                                      |
|:---------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------:|
| <img src="/.github/images/demo/mobile.png" width="10%" hspace="2" alt="mobile" /> | <img src="/.github/images/demo/tablet.png" width="30%" hspace="2" alt="tablet" /> | <img src="/.github/images/demo/telly.png" width="60%" hspace="2" alt="telly" /> |

