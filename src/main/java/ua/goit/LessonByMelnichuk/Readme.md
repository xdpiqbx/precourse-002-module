
### [jsoup](https://jsoup.org/download)

**jsoup** is a Java library for working with real-world HTML. It provides a very convenient API for fetching URLs and extracting and manipulating data, using the best of HTML5 DOM methods and CSS selectors.

If you use Maven to manage the dependencies in your Java project, you do not need to download; just place the following into your POM's `<dependencies>` section:

```xml
<dependency>
  <!-- jsoup HTML parser library @ https://jsoup.org/ -->
  <groupId>org.jsoup</groupId>
  <artifactId>jsoup</artifactId>
  <version>1.15.3</version>
</dependency>
```

``` code
mvn clean install -U
```

---

### [github.com/public-apis](https://github.com/public-apis/public-apis)