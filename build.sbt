name := "US_Crop_Data_Analysis"

lazy val usAgricultureAnalysis = (project in file("."))
  .settings(UsAgricultureDataAnalysis.settings: _*)

lazy val csvPreprocessing = (project in file("csv_processing"))
  .settings(UsAgricultureDataAnalysis.settings: _*)
  .settings(
    name := "csv_preprocessing",
    libraryDependencies ++= UsAgricultureDataAnalysis.Dependencies.dependencies,
    version := "0.1.0"
  )
  

