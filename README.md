# Score QA Interview Test Case using Java and Appium

## Prerequisites

Before running the test case, ensure you have the following prerequisites installed:

- Java Development Kit (JDK) v11.0.23
- Appium v2.5.4
- Android Studio emulator (Tested on Pixel_6, API Level 33)

## Instructions

1. Clone this repository to your local machine.
2. Create Android Studio Emulator with above specifications (Pixel_6, API Level 33)
   - Use `PrithviPhone` as the Device_Name. If you want to specify a different name, make sure you update the `local.properties` file.
3. Start the Appium Server in your terminal with `appium` command.
4. Start Android Studio Emulator device that you created in step 2.
5. Navigate to the repository root directory.
6. Run the TestSuite with `mvn install` command.
7. If you are using Intellij, you can view extent reports in `target/Reports`.

## Test Specification
1. Once the App is installed, we go through the inital setup steps.
2. We click on Leagues tab.
3. Now click the `NBA Basketball` league and verify you land into that page.
4. Now select the Leaders sub-tab and verify the data is loading in the leaders tab.
5. Now click on the back button and verify you are landing on the previous page.
