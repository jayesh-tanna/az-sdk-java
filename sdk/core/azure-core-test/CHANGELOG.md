# Release History

## 1.27.0-beta.10 (2025-06-26)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.4` to `1.55.5`.
- Upgraded JUnit 5 from `5.11.2` to `5.13.1`.

## 1.27.0-beta.9 (2025-06-05)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.3` to `1.55.4`.

## 1.27.0-beta.8 (2025-03-10)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.2` to `1.55.3`.

## 1.27.0-beta.7 (2025-02-20)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.1` to `1.55.2`.

## 1.27.0-beta.6 (2025-02-12)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.55.0` to `1.55.1`.

## 1.27.0-beta.5 (2025-02-06)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.54.1` to `1.55.0`.

## 1.27.0-beta.4 (2024-11-14)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.54.0` to `1.54.1`.

## 1.27.0-beta.3 (2024-11-01)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.53.0` to `1.54.0`.

## 1.27.0-beta.2 (2024-10-01)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.52.0` to `1.53.0`.

## 1.27.0-beta.1 (2024-09-12)

### Features Added

- Added dependencies on HTTP client implementations. Packages using `azure-core-test` as a testing dependency no longer
  need to add dependencies on HTTP client implementations to enable using different HTTP clients in testing.

### Breaking Changes

- Moved code related to testing HTTP client implementations to shared `azure-core` test code.
- Replaced dependency `commons-compress` with `ant` to handle tar.gz files. `ant` has fewer transitive dependencies,
  reducing the likelihood of dependency conflicts.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.51.0` to `1.52.0`.

## 1.26.2 (2024-07-31)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.50.0` to `1.51.0`.

## 1.26.1 (2024-07-12)
### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.1` to `1.50.0`.

## 1.26.0 (2024-06-06)

### Features Added

- Added `InterceptorManager.removeSanitizers` to remove sanitizers used by Test Proxy.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.49.0` to `1.49.1`.

## 1.25.0 (2024-05-01)

### Features Added

- `TestContextManager` added `setTestIteration(Integer)` and `getTrackTestName`.
- Added annotations `LiveOnly` and `PlaybackOnly` to skip tests from running in other testing modes.
- Added `TestContextManagerParameterResolver` to manage resolving `TestContextManager` parameters.

### Breaking Changes

- `TestBase` no longer extends `BeforeEachCallback`.
- `TestBase.setupTest` now takes `TestContextManager` rather than `TestInfo`, which is provided by `TestContextManagerParameterResolver`.
- `TestBase.teardownTest` no longer takes a parameter.
- `TestProxyTestBase.setupTestProxy` no longer takes a parameter.
- `TestContextManager` no longer validates that a non-PLAYBACK test was ran in PLAYBACK mode, `TestBase` validates that now.
- `DoNotRecord` deprecated `skipInPlayback`, if a test should be skipped in PLAYBACK and shouldn't be recorded it should
  be annotated with both `DoNotRecord` and `LiveOnly`.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.48.0` to `1.49.0`.

## 1.24.2 (2024-04-23)

### Other Changes

- Added more missing sanitizers.

## 1.24.1 (2024-04-05)

### Other Changes

- Added missing sanitizers.

#### Dependency Updates

- Upgraded `azure-core` from `1.47.0` to `1.48.0`.

## 1.24.0 (2024-03-01)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.46.0` to `1.47.0`.

## 1.23.0 (2024-02-02)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.45.1` to `1.46.0`.

## 1.22.0 (2023-11-03)

### Features Added

- Added request retry to Test Proxy. ([#36656](https://github.com/Azure/azure-sdk-for-java/pull/36656))

### Breaking Changes

- Made `TextProxyManager` `final`, removed constructor, made `startProxy` static, and hid `stopProxy`. ([#36656](https://github.com/Azure/azure-sdk-for-java/pull/36656))

### Bugs Fixed

- Fixed a bug where Test Proxy could deadlock during test runs as the error stream wasn't consumed. ([#37140](https://github.com/Azure/azure-sdk-for-java/pull/37140))
- Fixed a bug where `aarch64` didn't match to `arm64`. ([#37137](https://github.com/Azure/azure-sdk-for-java/pull/37137))

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.44.1` to `1.45.0`.

## 1.21.1 (2023-10-17)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.44.0` to `1.44.1`.
- Upgraded `reactor-test` from `3.4.31` to `3.4.32`.
- Upgraded `reactor-netty-http` from `1.0.34` to `1.0.38`.
- Upgraded `jetty-server` from `9.4.51.v20230217` to `9.4.53.v20231009`.
- Upgraded `jetty-servlet` from `9.4.51.v20230217` to `9.4.53.v20231009`.
- Upgraded `commons-compress` from `1.22` to `1.24.0`.

## 1.21.0 (2023-10-06)

### Features Added

- Added support for bulk `AddSanitizers` in Test Proxy. ([#36694](https://github.com/Azure/azure-sdk-for-java/pull/36694))

### Bugs Fixed

- Aligned XML redactions for Test Proxy with previous recording framework. ([#37043](https://github.com/Azure/azure-sdk-for-java/pull/37043))

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.43.0` to `1.44.0`.

## 1.20.0 (2023-09-07)

### Features Added

- Added `TestProxyRecordingOptions` model representing the transport layer options to send to the test proxy when recording.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.42.0` to `1.43.0`.

## 1.19.0 (2023-08-04)

### Features Added
- Add helper methods for adding sanitizers and matchers
- Updated the list of headers to redact to include "subscription-key"

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.41.0` to `1.42.0`.

## 1.18.1 (2023-07-06)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.40.0` to `1.41.0`.

## 1.18.0 (2023-06-02)

### Features Added

- Enabled ability to use test playback records from the assets repo, removing the need to maintain them in `azure-sdk-for-java`.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.39.0` to `1.40.0`.

## 1.17.0 (2023-05-04)

### Features Added

- Enabled ability to skip matching request bodies with Test Proxy. ([#34631](https://github.com/Azure/azure-sdk-for-java/pull/34631))

### Bugs Fixed

- Updated command line for Test Proxy to match changes it had with options. ([#34748](https://github.com/Azure/azure-sdk-for-java/pull/34748))

### Other Changes

- Include names of long-running tests if test run takes longer than 30 minutes. ([#34374](https://github.com/Azure/azure-sdk-for-java/pull/34374))

#### Dependency Updates

- Upgraded `azure-core` from `1.38.0` to `1.39.0`.

## 1.16.2 (2023-04-19)

### Bugs fixed
- Refactored startup of test-proxy instances to properly work in multi-threaded situations.

## 1.16.1 (2023-04-13)

### Bugs Fixed

- Updated timeout values for waiting for test proxy initialization.

## 1.16.0 (2023-04-07)

### Features Added

- Added `InterceptorManager.isRecordMode` to determine if the testing mode is `RECORD`.
- Added support for generic regex `TestProxySanitizer`.

### Bugs Fixed

- Fixed a bug where the URL would remain the Test Proxy URL instead of the service URL being called through the proxy.
- Fixed a bug where Test Proxy headers could be added multiple times to only be set once.
- Fixed a bug where multiple thread could try to download and start the test proxy resulting in random failures.

### Other Changes

- Added `Operation-Location` and `api-key` as default headers to redact when using Test Proxy.

#### Dependency Updates

- Upgraded `azure-core` from `1.37.0` to `1.38.0`.

## 1.15.0 (2023-03-02)

### Features Added
- Enabled test proxy recording for test records using test proxy integration. 

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.36.0` to `1.37.0`.

## 1.14.1 (2023-02-01)

### Bugs Fixed

- Fixed a `NullPointerException` when `AssertingClient` is used with a null `skipRequestBiFunction`.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.35.0` to `1.36.0`.

## 1.14.0 (2023-01-05)

### Features Added

- Added `TestUtils` containing utility methods for testing.
- Changed how the `session-records` folder would be searched for, enhancing the exception message when not found.

### Other Changes

- `MockHttpResponse` now returns the internal instance of `HttpHeaders` instead of a copy to align with how
  `HttpResponse` works.

#### Dependency Updates

- Upgraded `azure-core` from `1.34.0` to `1.35.0`.

## 1.13.0 (2022-11-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.33.0` to `1.34.0`.

## 1.12.1 (2022-10-07)

### Bugs Fixed

- Fixed a bug where `session-records` folder didn't exist a `NullPointerException` would be thrown. Now the folder is
  created when it doesn't exist.
- Fixed a bug where `URL.getPath` of a file would contain special characters and result in the file not being found. Now
  `URL.toURI` is used which converts URL encoded characters to their filesystem representation (`"%20"` -> `" "`).

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.32.0` to `1.33.0`.

## 1.12.0 (2022-09-01)

### Features Added

- Added metrics-based testing utilities.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.31.0` to `1.32.0`.

## 1.11.0 (2022-08-05)

### Features Added

- Added `AssertingClient` which asserts whether asynchronous or synchronous APIs are called.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.30.0` to `1.31.0`.

## 1.10.0 (2022-06-30)

### Features Added

- Added `ThreadDumper` which will dump thread data if testing is assumed to be deadlocked.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.29.1` to `1.30.0`.

## 1.9.1 (2022-06-03)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.29.0` to `1.29.1`.

## 1.9.0 (2022-06-03)

### Features Added
- Added `getRequestUrl` and `canSendBinaryData` methods to HttpClientTests

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.28.0` to `1.29.0`.
- 
## 1.8.0 (2022-05-06)

### Features Added

- Added `TestConfigurationSource` to enable mocking of a `ConfigurationSource`.

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.27.0` to `1.28.0`.

## 1.7.10 (2022-04-01)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.26.0` to `1.27.0`.

## 1.7.9 (2022-03-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.25.0` to `1.26.0`.

## 1.7.8 (2022-02-04)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.24.1` to `1.25.0`.

## 1.7.7 (2022-01-11)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.24.0` to `1.24.1`.

## 1.7.6 (2022-01-06)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.23.1` to `1.24.0`.

## 1.7.5 (2021-12-07)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.22.0` to `1.23.1`.

## 1.7.4 (2021-11-05)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.21.0` to `1.22.0`.

## 1.7.3 (2021-10-15)

### Bugs Fixed

- Fixed a bug where an exception may be thrown when recording test runs.

## 1.7.2 (2021-10-01)

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.20.0` to `1.21.0`.

## 1.7.1 (2021-09-07)

### Fixed

- Fixed a `NullPointerException` when loading test `HttpClient`. ([#23559](https://github.com/Azure/azure-sdk-for-java/pull/23559))

### Other Changes

#### Dependency Updates

- Upgraded `azure-core` from `1.19.0` to `1.20.0`.

## 1.7.0 (2021-08-06)

### Features Added

- Added `AzureMethodSource` which enables creating test permutations using `HttpClient`, `ServiceVersion`, and a generic
  method source supplier function. ([#20484](https://github.com/Azure/azure-sdk-for-java/pull/20484))
- Added utility methods to `TestBase` to allow setting playback test polling and setting playback or live test `HttpClient`.

### Dependency Updates

- Upgraded `azure-core` from `1.18.0` to `1.19.0`.

## 1.6.4 (2021-07-01)

### Dependency Updates

- Upgraded `azure-core` from `1.17.0` to `1.18.0`.

## 1.6.3 (2021-06-07)

### Features Added

- Updated JUnit 5 test status logging to only long when `AZURE_TEST_DEBUG` is `true` instead of always logging.

### Dependency Updates

- Upgraded `azure-core` from `1.16.0` to `1.17.0`.
- Upgraded JUnit 5 from `5.7.1` to `5.7.2`.

## 1.6.2 (2021-05-07)

### Dependency Updates

- Upgraded `azure-core` from `1.15.0` to `1.16.0`.

## 1.6.1 (2021-04-02)

### Dependency Updates

- Upgraded `azure-core` from `1.14.0` to `1.15.0`.

## 1.6.0 (2021-03-08)

### Dependency Updates

- Updated `azure-core` from `1.13.0` to `1.14.0`.

## 1.5.3 (2021-02-05)

### Dependency Updates

- Updated `azure-core` from `1.12.0` to `1.13.0`.

## 1.5.2 (2021-01-11)

### Dependency Updates

- Updated `azure-core` from `1.10.0` to `1.12.0`.

## 1.5.1 (2020-10-29)

### Dependency Updates

- Updated `azure-core` to `1.10.0`.

### Bug Fixes

- Fixed a bug in test recording redaction for redacting empty values for json key-value pairs.

## 1.5.0 (2020-10-01)

### New Features

- Enhanced playback recording to use test class name plus test name to identify records.

### Bug Fixes

- Added additional response data redaction.
- Updated handling of `HttpClient` retrieval from the classpath to no longer require dependent libraries to `add-opens` in Java 9+.

## 1.4.2 (2020-09-08)

- Updated `azure-core` version to pickup bug fix.

## 1.4.1 (2020-09-03)

- Updated `azure-core` dependency.

## 1.4.0 (2020-08-07)

- Added `AzureTestWatch` which implements JUnit's `Extension` SPI. It adds test watching extensibility such as logging test completion time.
- Fixed a bug in test recording redaction which was accidentally redacting XML values when they shouldn't be redacted.
- Enhanced recording of `application/octet-stream` and `avro/binary` data to be more space efficient and faster to write and read.

## 1.3.1 (2020-07-02)

- Updated Azure Core dependency.

## 1.3.0 (2020-06-08)

- Added new APIs used to redact sensitive information from playback recordings.
- Updated Azure Core dependency.

## 1.2.1 (2020-05-04)

- Updating dependencies.

## 1.2.0 (2020-04-03)

- Updating dependencies.

## 1.1.0 (2020-01-07)

## 1.1.0-beta.2 (2019-12-18)
- Quick release to have client library depends on the right version of azure-core and azure-core-test changes.

## Version 1.1.0-beta.1 (2019-12-17)
- Added log message if playback json file is missing.
- Fixed bug which record failed for newly added tests.
- Switch to JUnit version 5.
- Allowed to record body when content type is not set.

## Version 1.0.0 (2019-10-29)
This package's
[documentation](https://github.com/Azure/azure-sdk-for-java/blob/azure-core-test_1.0.0/sdk/core/azure-core-test/README.md)

- Initial release. Please see the README and wiki for information on the new design.
