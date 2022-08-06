# Server Fundamentals

**What Are Servlets?**
+ Java class that is processed on the server
+ Java class generates HTML that is returned to browser
+ Can read HTML from data, use cookies and sessions etc...
+ At a high-level, similar functionality to JSPs

## Hello World Servlet - Overview

![](readMeImg/img.png)

![img.png](img.png)

## Comparing Servlets and JSP - What's the Difference 

**JSP and Servlets**
<img src="readMeImg/img_2.png" width=500 />


_JSPs_
+ HTML file with .jsp extension
+ Contains static HTML 
+ JSP to generate HTML 
+ Has built-in JSP objects

_Servlets_
+ Java class file 
+ Generate all HTML
+ More steps to access web objects

**Which One?**
+ Can use either on for building java web apps...
+ Build entire site using only Servlets ... or
+ Build entire site using only JSPs
>**Historical Note:** Servlets released in 1997 and JSP released in 1999

**Best Practice**
+ Integrate them both together!
  + Servlet does the business logic
  + JSP handles the presentation view
+ Model-View-Controller (MVC) Design Pattern
