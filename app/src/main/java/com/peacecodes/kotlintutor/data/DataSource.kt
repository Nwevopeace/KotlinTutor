package com.peacecodes.kotlintutor.data

import com.peacecodes.kotlintutor.R
import com.peacecodes.kotlintutor.model.KotlinFundamentals

class DataSource {
    fun loadKotlinFundamentals(): List<KotlinFundamentals>{
        return listOf(
            KotlinFundamentals("Kotlin Introduction", "<h2>What is Kotlin?</h2>\nKotlin is an open-source statically typed programming language that targets the JVM, Android, JavaScript and Native. It’s developed by JetBrains. The project started in 2010 and was open source from very early on. The first official 1.0 release was in February 2016.<br><br><h3>What is the current version of Kotlin?</h3>\nThe currently released version is 1.5.31, published on September 20, 2021. <br><br><h3>Overview</h3>\nKotlin can be used for any kind of development, be it server-side, client-side web and Android. With Kotlin/Native currently in the works, support for other platforms such as embedded systems, macOS and iOS is coming. People are using Kotlin for mobile and server-side applications, client-side with JavaScript or JavaFX, and data science, just to name a few possibilities. <br><br><h3>What IDEs support Kotlin?</h3>\nKotlin is supported by all major Java IDEs including IntelliJ IDEA, Android Studio, and Eclipse. In addition, a command line compiler is available and provides straightforward support for compiling and running applications. <br><br><h3>What build tools support Kotlin?</h3>\n On the JVM side, the main build tools include Gradle, Maven, Ant, and Kobalt. There are also some build tools available that target client-side JavaScript. <br><br><h3>What does Kotlin compile down to?</h3>\nWhen targeting the JVM, Kotlin produces Java compatible bytecode. When targeting JavaScript, Kotlin transpiles to ES5.1 and generates code which is compatible with module systems including AMD and CommonJS. When targeting native, Kotlin will produce platform-specific code (via LLVM)."),
            KotlinFundamentals("Kotlin Variables", "<h2>Kotlin Variable</h2>\nVariable refers to a memory location. It is used to store data. The data of variable can be changed and reused depending on condition or on information passed to the program. <br><br><h3>Variable declaration</h3>\nKotlin uses two different keywords to declare variables: val and var. <br>- Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val (Immutable variable). <br>- Use var for a variable whose value can change (Mutable variable).",),
            KotlinFundamentals("Kotlin Comments", "Comments can be used to explain Kotlin code, and to make it more readable. It can also be used to prevent execution when testing alternative code. Single-line Comments Single-line comments starts with two forward slashes (//). Any text between // and the end of the line is ignored by Kotlin (will not be executed). This example uses a single-line comment before a line of code: Example // This is a comment println(\"Hello World\")"),
            KotlinFundamentals("Kotlin Data Type", "<h2>Basic types</h2>\nIn Kotlin, everything is an object in the sense that we can call member functions and properties on any variable. Some types can have a special internal representation - for example, numbers, characters and booleans can be represented as primitive values at runtime - but to the user they look like ordinary classes. In this section we describe the basic types used in Kotlin: numbers, booleans, characters, strings, and arrays.",),
            KotlinFundamentals("Kotlin Operators", "[Operators are used to perform operations on variables and values.\n" +
                    "    \\n\\n\n" +
                    "    The value is called an operand, while the operation (to be performed between the two operands) is defined by an operator:\n" +
                    "    \\n\\n\n" +
                    "    Operand\tOperator\tOperand\n" +
                    "    100\t+\t50\n" +
                    "    In the example below, the numbers 100 and 50 are operands, and the + sign is an operator:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    var x = 100 + 50\n" +
                    "    Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and a variable:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    var sum1 = 100 + 50       // 150 (100 + 50)\n" +
                    "    var sum2 = sum1 + 250     // 400 (150 + 250)\n" +
                    "    var sum3 = sum2 + sum2    // 800 (400 + 400)\n" +
                    "    Kotlin divides the operators into the following groups:\n" +
                    "    \\n\\n\n" +
                    "    Arithmetic operators\n" +
                    "    Assignment operators\n" +
                    "    Comparison operators\n" +
                    "    Logical operators\n" +
                    "    Arithmetic Operators\n" +
                    "    Arithmetic operators are used to perform common mathematical operations.\n" +
                    "    \\n\\n\n" +
                    "    Operator\tName\tDescription\tExample\tTry it\n" +
                    "    +\tAddition\tAdds together two values\tx + y\n" +
                    "     -\tSubtraction\tSubtracts one value from another\tx - y\n" +
                    "    *\tMultiplication\tMultiplies two values\tx * y\n" +
                    "    /\tDivision\tDivides one value from another\tx / y\n" +
                    "    %\tModulus\tReturns the division remainder\tx % y\n" +
                    "    ++\tIncrement\tIncreases the value by 1\t++x\n" +
                    "    —\tDecrement\tDecreases the value by 1\t—x\n" +
                    "    Kotlin Assignment Operators\n" +
                    "    Assignment operators are used to assign values to variables.\n" +
                    "    \\n\\n\n" +
                    "    In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    var x = 10\n" +
                    "    The addition assignment operator (+=) adds a value to a variable:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    var x = 10\n" +
                    "    x += 5\n" +
                    "    A list of all assignment operators:\n" +
                    "    \\n\\n\n" +
                    "    Operator\tExample\tSame As\tTry it\n" +
                    "    =\tx = 5\tx = 5\n" +
                    "    +=\tx += 3\tx = x + 3\n" +
                    "     -=\tx -= 3\tx = x - 3\n" +
                    "    *=\tx *= 3\tx = x * 3\n" +
                    "    /=\tx /= 3\tx = x / 3\n" +
                    "    %=\tx %= 3\tx = x % 3\n" +
                    "    Kotlin Comparison Operators\n" +
                    "    Comparison operators are used to compare two values, and returns a Boolean value: either true or false.\n" +
                    "    \\n\\n\n" +
                    "    Operator\tName\tExample\tTry it\n" +
                    "    ==\tEqual to\tx == y\n" +
                    "    !=\tNot equal\tx != y\n" +
                    "    >\tGreater than\tx > y\n" +
                    "        "),
            KotlinFundamentals("Kotlin Array", "Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.\n" +
                    "    \\n\\n\n" +
                    "    To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:\n" +
                    "    \\n\\n\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    Access the Elements of an Array\n" +
                    "    You can access an array element by referring to the index number, inside square brackets.\n" +
                    "    \\n\\n\n" +
                    "    In this example, we access the value of the first element in cars:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    println(cars[0])\n" +
                    "    // Outputs Volvo\n" +
                    "    Note: Just like with Strings, Array indexes start with 0: [0] is the first element. [1] is the second element, etc.\n" +
                    "    \\n\\n\n" +
                    "    Change an Array Element\n" +
                    "    To change the value of a specific element, refer to the index number:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    cars[0] = \"Opel\"\n" +
                    "    Example\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    cars[0] = \"Opel\"\n" +
                    "    println(cars[0])\n" +
                    "    // Now outputs Opel instead of Volvo\n" +
                    "    Array Length / Size\n" +
                    "    To find out how many elements an array have, use the size property:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    println(cars.size)\n" +
                    "    // Outputs 4\n" +
                    "    Check if an Element Exists\n" +
                    "    You can use the in operator to check if an element exists in an array:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    if (\"Volvo\" in cars) {\n" +
                    "      println(\"It exists!\")\n" +
                    "    } else {\n" +
                    "      println(\"It does not exist.\")\n" +
                    "    }\n" +
                    "    Loop Through an Array\n" +
                    "    Often when you work with arrays, you need to loop through all of the elements.\n" +
                    "    \\n\\n\n" +
                    "    You can loop through the array elements with the for loop, which you will learn even more about in the next chapter.\n" +
                    "    \\n\\n\n" +
                    "    The following example outputs all elements in the cars array:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    for (x in cars) {\n" +
                    "      println(x)\n" +
                    "    }"),
            KotlinFundamentals("Kotlin Ranges", "With the for loop, you can also create ranges of values with \"..\":\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    Print the whole alphabet:\n" +
                    "    \\n\\n\n" +
                    "    for (chars in \\'a\\'..\\'x\\') {\n" +
                    "      println(chars)\n" +
                    "    }\n" +
                    "    You can also create ranges of numbers:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    for (nums in 5..15) {\n" +
                    "      println(nums)\n" +
                    "    }\n" +
                    "    Note: The first and last value is included in the range.\n" +
                    "    \\n\\n\n" +
                    "    Check if a Value Exists\n" +
                    "    You can also use the in operator to check if a value exists in a range:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val nums = arrayOf(2, 4, 6, 8)\n" +
                    "    if (2 in nums) {\n" +
                    "      println(\"It exists!\")\n" +
                    "    } else {\n" +
                    "      println(\"It does not exist.\")\n" +
                    "    }\n" +
                    "    Example\n" +
                    "    val cars = arrayOf(\"Volvo\", \"BMW\", \"Ford\", \"Mazda\")\n" +
                    "    if (\"Volvo\" in cars) {\n" +
                    "      println(\"It exists!\")\n" +
                    "    } else {\n" +
                    "      println(\"It does not exist.\")\n" +
                    "    }\n" +
                    "    Break or Continue a Range\n" +
                    "    You can also use the break and continue keywords in a range/for loop:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    Stop the loop when nums is equal to 10:\n" +
                    "    \\n\\n\n" +
                    "    for (nums in 5..15) {\n" +
                    "      if (nums == 10) {\n" +
                    "        break\n" +
                    "      }\n" +
                    "      println(nums)\n" +
                    "    }\n" +
                    "    Example\n" +
                    "    Skip the value of 10 in the loop, and continue with the next iteration:\n" +
                    "    \\n\\n\n" +
                    "    for (nums in 5..15) {\n" +
                    "      if (nums == 10) {\n" +
                    "        continue\n" +
                    "      }\n" +
                    "      println(nums)\n" +
                    "    }"),
            KotlinFundamentals("Kotlin Strings", "<h2>Kotlin String</h2> \nAn array of characters is called a string. Kotlin strings are mostly similar to Java strings but has some new added functionalities. Kotlin strings are also immutable in nature means we can not change elements and length of the String. <br><br>To declare a string in Kotlin, we need to use double quotes, single quotes are not allowed to define Strings.",),
            KotlinFundamentals("Kotlin Boolean", "Very often, in programming, you will need a data type that can only have one of two values, like:\n" +
                    "    \\n\\n\n" +
                    "    YES / NO\n" +
                    "    ON / OFF\n" +
                    "    TRUE / FALSE\n" +
                    "    For this, Kotlin has a Boolean data type, which can take the values true or false.\n" +
                    "    \\n\\n\n" +
                    "    Boolean Values\n" +
                    "    A boolean type can be declared with the Boolean keyword and can only take the values true or false:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val isKotlinFun: Boolean = true\n" +
                    "    val isFishTasty: Boolean = false\n" +
                    "    println(isKotlinFun)   // Outputs true\n" +
                    "    println(isFishTasty)   // Outputs false\n" +
                    "    Just like you have learned with other data types in the previous chapters, the example above can also be written without specifying the type, as Kotlin is smart enough to understand that the variables are Booleans:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val isKotlinFun = true\n" +
                    "    val isFishTasty = false\n" +
                    "    println(isKotlinFun)   // Outputs true\n" +
                    "    println(isFishTasty)   // Outputs false\n" +
                    "    Boolean Expression\n" +
                    "    A Boolean expression returns a Boolean value: true or false.\n" +
                    "    \\n\\n\n" +
                    "    You can use a comparison operator, such as the greater than (>) operator to find out if an expression (or a variable) is true:\n" +
                    "\n" +
                    "    Example\n" +
                    "    val x = 10\n" +
                    "    val y = 9\n" +
                    "    println(x > y) // Returns true, because 10 is greater than 9\n" +
                    "    Or even easier:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    println(10 > 9) // Returns true, because 10 is greater than 9\n" +
                    "    In the examples below, we use the equal to (==) operator to evaluate an expression:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val x = 10;\n" +
                    "    println(x == 10); // Returns true, because the value of x is equal to 10\n" +
                    "    Example\n" +
                    "    println(10 == 15); // Returns false, because 10 is not equal to 15\n" +
                    "    The Boolean value of an expression is the basis for all Kotlin comparisons and conditions.\n" +
                    "    \\n\\n\n" +
                    "    You will learn more about conditions in the next chapter."),
            KotlinFundamentals("Kotlin Function", " \"<h3>Kotlin functions</h3>\\nA function is a unit of code that performs a special task. In programming, function is used to break the code into smaller modules which makes the program more manageable. <br>In Kotlin, there are two types of function: <br>- Standard library function <br>- User defined function. <br><br><h2>Kotlin standard library function</h2>\\nIn Kotlin, there are different number of built-in functions already defined in standard library and available for use. We can call them by passing arguments according to requirement. Some standard library function includes: sqrt(), print(), rem(), toInt(), readline(), compareTo(), etc. <br><br><h2>Kotlin user-defined function</h2>\\nA function which is defined by the user is called user-defined function. As we know, to divide a large program in small modules we need to define function. Each defined function has its own properties like name of function, return type of a function, number of parameters passed to the function etc.\",\n" +
                    "            ),"),
            KotlinFundamentals("Kotlin Classes and Objects", "Everything in Kotlin is associated with classes and objects, along with its properties and functions. For example: in real life, a car is an object. The car has properties, such as brand, weight and color, and functions, such as drive and brake.\n" +
                    "    \\n\\n\n" +
                    "    A Class is like an object constructor, or a \"blueprint\" for creating objects.\n" +
                    "    \\n\\n\n" +
                    "    Create a Class\n" +
                    "    To create a class, use the class keyword, and specify the name of the class:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    Create a Car class along with some properties (brand, model and year)\n" +
                    "    \\n\\n\n" +
                    "    class Car {\n" +
                    "      var brand = \"\"\n" +
                    "      var model = \"\"\n" +
                    "      var year = 0\n" +
                    "    }\n" +
                    "    A property is basically a variable that belongs to the class.\n" +
                    "    \\n\\n\n" +
                    "    Good to Know: It is considered good practice to start the name of a class with an upper case letter, for better organization.\n" +
                    "    \\n\\n\n" +
                    "    Create an Object\n" +
                    "    Now we can use the class named Car to create objects.\n" +
                    "    \\n\\n\n" +
                    "    In the example below, we create an object of Car called c1, and then we access the properties of c1 by using the dot syntax (.), just like we did to access array and string properties:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    // Create a c1 object of the Car class\n" +
                    "    val c1 = Car()\n" +
                    "    \\n\\n\n" +
                    "    // Access the properties and add some values to it\n" +
                    "    c1.brand = \"Ford\"\n" +
                    "    c1.model = \"Mustang\"\n" +
                    "    c1.year = 1969\n" +
                    "    \\n\\n\n" +
                    "    println(c1.brand)   // Outputs Ford\n" +
                    "    println(c1.model)   // Outputs Mustang\n" +
                    "    println(c1.year)    // Outputs 1969\n" +
                    "    Multiple Objects\n" +
                    "    You can create multiple objects of one class:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    val c1 = Car()\n" +
                    "    c1.brand = \"Ford\"\n" +
                    "    c1.model = \"Mustang\"\n" +
                    "    c1.year = 1969\n" +
                    "    \\n\\n\n" +
                    "    val c2 = Car()\n" +
                    "    c2.brand = \"BMW\"\n" +
                    "    c2.model = \"X5\"\n" +
                    "    c2.year = 1999\n" +
                    "    \\n\\n\n" +
                    "    println(c1.brand)  // Ford\n" +
                    "    println(c2.brand)  // BMW"),
            KotlinFundamentals("Kotlin Class Functions", "You can also use functions inside a class, to perfom certain actions:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    Create a drive() function inside the Car class and call it:\n" +
                    "    \\n\\n\n" +
                    "    class Car(var brand: String, var model: String, var year: Int) {\n" +
                    "      // Class function\n" +
                    "      fun drive() {\n" +
                    "        println(\"Wrooom!\")\n" +
                    "      }\n" +
                    "    }\n" +
                    "    \\n\\n\n" +
                    "    fun main() {\n" +
                    "      val c1 = Car(\"Ford\", \"Mustang\", 1969)\n" +
                    "    \\n\\n\n" +
                    "      // Call the function\n" +
                    "      c1.drive()\n" +
                    "    }\n" +
                    "    Tip: When a function is declared inside a class, it is known as a class function, or member function.\n" +
                    "    \\n\\n\n" +
                    "    Note: When an object of the class is created, it has access to all of the class functions.\n" +
                    "    \\n\\n\n" +
                    "    Class Function Parameters\n" +
                    "    Just like with regular functions, you can pass parameters to a class function:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    Create two functions: drive() and speed(), and pass parameters to the speed() function:\n" +
                    "\n" +
                    "    c\\n\\nlass Car(var brand: String, var model: String, var year: Int) {\n" +
                    "      // Class function\n" +
                    "      fun drive() {\n" +
                    "        println(\"Wrooom!\")\n" +
                    "      }\n" +
                    "    \\n\\n\n" +
                    "      // Class function with parameters\n" +
                    "      fun speed(maxSpeed: Int) {\n" +
                    "        println(\"Max speed is: \" + maxSpeed)\n" +
                    "      }\n" +
                    "    }\n" +
                    "    \\n\\n\n" +
                    "    fun main() {\n" +
                    "      val c1 = Car(\"Ford\", \"Mustang\", 1969)\n" +
                    "    \\n\\n\n" +
                    "      // Call the functions\n" +
                    "      c1.drive()\n" +
                    "      c1.speed(200)\n" +
                    "    }"),
            KotlinFundamentals("Kotlin Constructors", "In the previous chapter, we created an object of a class, and specified the properties inside the class, like this:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    class Car {\n" +
                    "      var brand = \"\"\n" +
                    "      var model = \"\"\n" +
                    "      var year = 0\n" +
                    "    }\n" +
                    "    \\n\\n\n" +
                    "    fun main() {\n" +
                    "      val c1 = Car()\n" +
                    "      c1.brand = \"Ford\"\n" +
                    "      c1.model = \"Mustang\"\n" +
                    "      c1.year = 1969\n" +
                    "    }\n" +
                    "    In Kotlin, there\\'s a faster way of doing this, by using a constructor.\n" +
                    "    \\n\\n\n" +
                    "    A constructor is like a special function, and it is defined by using two parantheses () after the class name. You can specify the properties inside of the parantheses (like passing parameters into a regular function).\n" +
                    "    \\n\\n\n" +
                    "    The constructor will initialize the properties when you create an object of a class. Just remember to specify the type of the property/variable:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    class Car(var brand: String, var model: String, var year: Int)\n" +
                    "    \\n\\n\n" +
                    "    fun main() {\n" +
                    "      val c1 = Car(\"Ford\", \"Mustang\", 1969)\n" +
                    "    }\n" +
                    "    Now it's even easier to specify multiple objects of one class:\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    class Car(var brand: String, var model: String, var year: Int)\n" +
                    "    \\n\\n\n" +
                    "    fun main() {\n" +
                    "      val c1 = Car(\"Ford\", \"Mustang\", 1969)\n" +
                    "      val c2 = Car(\"BMW\", \"X5\", 1999)\n" +
                    "      val c3 = Car(\"Tesla\", \"Model S\", 2020)\n" +
                    "    }"),
            KotlinFundamentals("Kotlin Inheritance", "In Kotlin, it is possible to inherit class properties and functions from one class to another. We group the \"inheritance concept\" into two categories:\n" +
                    "    \\n\\n\n" +
                    "    subclass (child) - the class that inherits from another class\n" +
                    "    superclass (parent) - the class being inherited from\n" +
                    "    In the example below, MyChildClass (subclass) inherits the properties from the MyParentClass class (superclass):\n" +
                    "    \\n\\n\n" +
                    "    Example\n" +
                    "    // Superclass\n" +
                    "    open class MyParentClass {\n" +
                    "      val x = 5\n" +
                    "    }\n" +
                    "    \\n\\n\n" +
                    "    // Subclass\n" +
                    "    class MyChildClass: MyParentClass() {\n" +
                    "      fun myFunction() {\n" +
                    "        println(x) // x is now inherited from the superclass\n" +
                    "      }\n" +
                    "    }\n" +
                    "    \\n\\n\n" +
                    "    // Create an object of MyChildClass and call myFunction\n" +
                    "    fun main() {\n" +
                    "      val myObj = MyChildClass()\n" +
                    "      myObj.myFunction()\n" +
                    "    }\n" +
                    "    Example Explained\n" +
                    "    Use the open keyword in front of the superclass/parent, to make this the class other classes should inherit properties and functions from.\n" +
                    "    \\n\\n\n" +
                    "    To inherit from a class, specify the name of the subclass, followed by a colon :, and then the name of the superclass.\n" +
                    "    \\n\\n\n" +
                    "    Why And When To Use \"Inheritance\"?\n" +
                    "     - It is useful for code reusability: reuse properties and functions of an existing class when you create a new class."),
            KotlinFundamentals("Kotlin OOP", "OOP stands for Object-Oriented Programming.\n" +
                    "    \\n\\n\n" +
                    "    Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.\n" +
                    "    \\n\\n\n" +
                    "    Object-oriented programming has several advantages over procedural programming:\n" +
                    "    \\n\\n\n" +
                    "    OOP is faster and easier to execute\n" +
                    "    OOP provides a clear structure for the programs\n" +
                    "    OOP helps to keep the Kotlin code DRY \"Don\\'t Repeat Yourself\", and makes the code easier to maintain, modify and debug\n" +
                    "    OOP makes it possible to create full reusable applications with less code and shorter development time\n" +
                    "    Tip: The \"Don\\'t Repeat Yourself\" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.\n" +
                    "    \\n\\n\n" +
                    "    Kotlin - What are Classes and Objects?\n" +
                    "    Classes and objects are the two main aspects of object-oriented programming.\n" +
                    "    \\n\\n\n" +
                    "    Look at the following illustration to see the difference between class and objects:\n" +
                    "    \\n\\n\n" +
                    "    class\n" +
                    "    Fruit\n" +
                    "    \\n\\n\n" +
                    "    objects\n" +
                    "    Apple\n" +
                    "    \\n\\n\n" +
                    "    Banana\n" +
                    "    \\n\\n\n" +
                    "    Mango\n" +
                    "    \\n\\n\n" +
                    "    Another example:\n" +
                    "    \\n\\n\n" +
                    "    class\n" +
                    "    Car\n" +
                    "    \\n\\n\n" +
                    "    objects\n" +
                    "    Volvo\n" +
                    "    \\n\\n\n" +
                    "    Audi\n" +
                    "    \\n\\n\n" +
                    "    Toyota\n" +
                    "    \\n\\n\n" +
                    "    So, a class is a template for objects, and an object is an instance of a class.\n" +
                    "    \\n\\n\n" +
                    "    When the individual objects are created, they inherit all the variables and methods from the class.\n" +
                    "    \\n\\n\n" +
                    "    You will learn much more about classes and objects in the next chapter.\n" +
                    "    ")
        )
    }
}