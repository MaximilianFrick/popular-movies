# Popular Movies
Second project of Android Developer Nanodegree course (Udacity).
Popular movies is an app which gives the user the possibility to browse through movies, get Informations about them and mark them as favorites.
## Features
* Display list of movies
* Filter them by _Popular Movies_, _Top Rated Movies_ or _Favorites_
* Detail-View with _Trailers_, _Reviews_ as well as Information around the movie
* Tablet friendly UI

The application is also designed completely **_without Fragments_**. Instead i only used Views in combination with the MVP-Pattern (based on the [googlesamples/android-architecture](https://github.com/googlesamples/android-architecture/tree/todo-mvp)).
## Getting Started
To use the Application you need an API-Key from [TheMovieDb](https://www.themoviedb.org).
Add your API-Key to your `gradle.properties` file like:
`MyTheMovieDbApiKey="YOUR_KEY"`

## Dependencies
* Butterknife
* Retrofit 2
* Dagger 2
* RxJava
* Picasso

## Screenshots
List and detail view

<img width="20%" src="https://cloud.githubusercontent.com/assets/4439173/21054315/6f890a74-be2d-11e6-84d4-79f68cac9d2c.png" />
<img width="20%" src="https://cloud.githubusercontent.com/assets/4439173/21054337/90131ae6-be2d-11e6-9b7e-7b36d2463427.png" />

<img width="70%" src="https://cloud.githubusercontent.com/assets/4439173/21054351/a39b0c54-be2d-11e6-800c-e5d9752fd85f.png" />


## License
```
Copyright 2016 Maximilian Frick

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
