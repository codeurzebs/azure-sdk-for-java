# Release History

## 1.0.0-beta.2 (2024-02-09)

### Breaking Changes

- In the previous version, you would call the `analyze` method on the `ImageAnalysisClient` or `ImageAnalysisAsyncClient` to analyze an image from a publicly accessible URL, or from a memory buffer. To better align with other Azure client libraires, this was changed in this release. Call the new dedicated `analyzeFromUrl` method to analyze an image from URL. Keep calling the `analyze` method to analyze an image from a memory buffer.
- The class constructor `ImageAnalysisOptions(String language, Boolean genderNeutralCaption, List<Double> smartCropsAspectRatios, String modelVersion)` was removed, since it is redundant. Instead use the empty constructor and override default values by calling the individual `set` method. For example: `ImageAnalysisOptions options = new ImageAnalysisOptions().setGenderNeutralCaption(true)`


## 1.0.0-beta.1 (2024-01-09)

- Azure Image Analysis client library for Java. Uses the generally available [Computer Vision REST API (2023-10-01)](https://eastus.dev.cognitive.microsoft.com/docs/services/Cognitive_Services_Unified_Vision_API_2023-10-01). Starting with this version, the client library is auto-generated (with some hand customization) from TypeSpec files, to better align with other Azure client libraries.

### Breaking Changes

- A previous version of the Image Analysis client library (version 0.15.1-beta.1) used a preview version of the Computer Vision REST API, and was coded by hand. With this new version, all APIs have changed. Please see [documentation](https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/vision/azure-ai-vision-imageanalysis) on how to use the new APIs.
- Image Analysis with a custom model is no longer supported by the client library, as Computer Vision REST API (2023-10-01) does not yet support it. To do Image Analysis with a custom model, write code to call the `Analyze` operation on [Computer Vision REST API (2023-04-01-preview)](https://eastus.dev.cognitive.microsoft.com/docs/services/unified-vision-apis-public-preview-2023-04-01-preview/operations/61d65934cd35050c20f73ab6).
- Image Segmentation (background removal) is no longer supported by the client library, as Computer Vision REST API (2023-10-01) does not yet support it. To do Image Segmentation, write code to call the `Segment` operation on [Computer Vision REST API (2023-04-01-preview)](https://eastus.dev.cognitive.microsoft.com/docs/services/unified-vision-apis-public-preview-2023-04-01-preview/operations/63e6b6d9217d201194bbecbd).


