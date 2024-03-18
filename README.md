<p align="center"><img width=100% src="/.github/images/materially.png" alt="Materially"></p>

# Materially
Merging current `Material3` libraries into one for reusable composables

## Why?
Currently in order to use `Material3` components for both mobile and tv you'll have to add checks for 
most of them. Materially merges mobile and tv `Material3` components into one.
> Example
- dependencies

|              mobile               | tv                           |
|:---------------------------------:|:-----------------------------|
| androidx.compose.material3.Button | androidx.tv.material3.Button |

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

