# Playwright_POM_Framework
What is a Page Object Model? Popularly known as POM, Page Object Model is a design pattern that creates a repository for storing all web elements. It is useful in reducing code duplication and improves test script maintenance.  In Page Object Model, consider each web page of an application as a separate class file. Each class file will contain only corresponding web page elements. Using these elements, testers can perform operations on the website under test.



########Advantages of Page Object Model

1. **Easy Maintenance:** In web automation, everything depends on the DOM tree and selectors. 
The page object model makes maintenance easier even if there is a change in the DOM tree 
and selectors we don’t have to modify everywhere. 
2. **Increased Reusability:** Using POM, we can reuse the code which is written for another test. 
Also, we can create custom helper methods to achieve this. Code Reusability reduces the code,
thus saving time and effort. 
3. **Readability:** As the tests are independent, it increases the readability




########Disadvantages of Page Object Model

1. Initial design and building framework take some time.
2. Good coding skills are required to set the POM framework
3. Elements are stored in a shared file, so even a tiny mistake in the page object file can lead to breaking the whole test
suite.
