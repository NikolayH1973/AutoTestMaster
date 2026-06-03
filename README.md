# AutoTestMaster — Selenium Web Automation Framework

![Java](https://img.shields.io/badge/Java-11-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-3.141.59-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-7.4.0-FF6C37?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.x-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

A production-style, multi-layer test automation framework built with Java and Selenium WebDriver.  
Designed to demonstrate real-world QA engineering practices — clean architecture, separation of concerns, and maintainable test code.

---

## 🏗️ Framework Architecture

The framework follows a **5-layer architecture** that separates infrastructure, UI interactions, page elements, business workflows, and test scenarios:

```
┌─────────────────────────────────────────┐
│          Tests (sanity layer)           │  ← What to verify
│     HappyFlows · TestsScenarios         │
├─────────────────────────────────────────┤
│           Workflows Layer               │  ← Business-level steps
│             WebFlows.java               │
├─────────────────────────────────────────┤
│           Extensions Layer              │  ← Reusable UI actions & assertions
│     UIActions · Verifications           │
├─────────────────────────────────────────┤
│          Page Objects Layer             │  ← Element locators per page
│  HomePage · NavBar · LoginPage · ...    │
├─────────────────────────────────────────┤
│           Utilities Layer               │  ← Driver init, config, page management
│    Base · CommonOps · ManagePages       │
└─────────────────────────────────────────┘
```

This structure ensures that a locator change requires editing **one file only**, and a test reads like a business scenario — not a list of XPath expressions.

---

## ✅ Test Coverage

| Test Class | Scenario | Status |
|---|---|---|
| `HappyFlows` | Click all left navigation menu tabs | ✅ |
| `HappyFlows` | Select site language (English / Russian) | ✅ |
| `HappyFlows` | Change currency (USD → SAR) | ✅ |
| `HappyFlows` | Open account box and navigate to Login | ✅ |
| `HappyFlows` | Login with dynamic language detection | ✅ |
| `TestsScenarios` | Verify Login page header text | ✅ |
| `TestsScenarios` | Full login flow with verification | ✅ |

---

## 🔧 Tech Stack

| Tool | Version | Purpose |
|---|---|---|
| Java | 11 | Core language |
| Selenium WebDriver | 3.141.59 | Browser automation |
| TestNG | 7.4.0 | Test execution & reporting |
| WebDriverManager | 5.9.2 | Automatic driver binaries management |
| Maven | 3.x | Build & dependency management |

**Tested site:** [phptravels.net](https://www.phptravels.net/) — a travel booking demo application

---

## 📁 Project Structure

```
AutoTestMaster/
├── src/
│   ├── main/java/
│   │   ├── utilities/
│   │   │   ├── Base.java           # Shared driver, wait, and page object references
│   │   │   ├── CommonOps.java      # Browser initialization, @BeforeClass / @AfterClass
│   │   │   └── ManagePages.java    # Centralized PageFactory initialization
│   │   ├── extensions/
│   │   │   ├── UIActions.java      # Reusable wrappers: click, type, list traversal
│   │   │   └── Verifications.java  # Custom assertion wrappers
│   │   ├── pageObjects/Phptravels/
│   │   │   ├── HomePagePhpTravels.java
│   │   │   ├── NavbarSupportedContend.java
│   │   │   ├── LoginPage.java
│   │   │   └── EnglishLoginPage.java
│   │   └── workflows/
│   │       └── WebFlows.java       # Business-level action sequences
│   └── test/java/sanity/
│       ├── HappyFlows.java         # Navigation and UI flow tests
│       └── TestsScenarios.java     # Verification and login scenario tests
└── pom.xml
```

---

## 🚀 Getting Started

### Prerequisites
- Java 11+
- Maven 3.x
- Google Chrome (latest)

### Run all tests
```bash
mvn test
```

### Run a specific test class
```bash
mvn test -Dtest=HappyFlows
mvn test -Dtest=TestsScenarios
```

---

## 💡 Key Engineering Decisions

**Why a Workflows layer?**  
Tests call `WebFlows.SiteLogin(email, pass)` instead of `driver.findElement(...).sendKeys(...)`.  
This means tests describe *intent*, not *implementation*. A locator change never touches test files.

**Why UIActions wraps Selenium calls?**  
Every click goes through `wait.until(ExpectedConditions.elementToBeClickable(...))` before executing.  
This eliminates flakiness from timing issues without adding `sleep()` calls everywhere.

**Why PageFactory + ManagePages?**  
All page objects are initialized once in `ManagePages.initPhptravels()` after driver setup.  
Tests never call `new LoginPage(driver)` — they just use the already-ready instance from `Base`.

**Multi-browser support**  
`CommonOps.initBrowser(String browserType)` supports Chrome, Firefox, Edge, and Safari  
through a single switch point — changing the browser requires editing one string.

---

## 👨‍💻 Author

**Nikolay Hovich**  
QA Automation Engineer  
[GitHub](https://github.com/NikolayH1973)
