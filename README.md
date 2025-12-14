# Junit 4 and Junit 5 Course
What is Junit? \
JUnit is a testing framework for Java used to write and run automated tests.

## Anotations
```bash
@Test	Marks a test method
@BeforeEach	Runs before every test
@AfterEach	Runs after every test
@BeforeAll	Runs once before all tests
@AfterAll	Runs once after all tests
```

## Assertions
```bash
assertEquals(expected, actual);
assertNotNull(obj);
assertTrue(condition);
assertFalse(condition);
assertThrows(Exception.class, () -> method());
assertArrayEquals(expected, actual)
```