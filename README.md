## Contenido | Content
- [Español](#enumeraciones-en-java)
    - [Qué son los enums?](#qué-son-los-enums)
    - [¿Para qué se usan los enums?](#para-qué-se-usan-los-enums)
    - [Ventajas](#ventajas)
    - [¿Cuándo debería usarlos?](#cuándo-debería-usarlos)
    - [Estructura del repositorio](#estructura-del-repositorio)
- [English](#enums-in-java)
    - [What are enums?](#what-are-enums)
    - [What are enums used for?](#what-are-enums-used-for)
    - [Advantages](#advantages)
    - [When should I use them?](#when-should-i-use-them)
    - [Repository structure](#repository-structure)
___
# Enumeraciones en Java
## Qué son los enums?
Son un tipo especial de clase en Java que permiten crear un tipo de dato propio y personalizado, con la particularidad de que dicho tipo de dato solo puede tomar uno de los valores predefinidos dentro del enum. Estos valores son constantes y no pueden cambiar en tiempo de ejecución.

## ¿Para qué se usan los enums?

Se utilizan para representar un conjunto limitado de valores posibles, como roles, estados o tipos dentro de un programa.

Los enums mejoran la legibilidad del código y ayudan a evitar errores causados por datos mal escritos o valores inválidos. Además, pueden contener lógica interna, lo que permite definir atributos y métodos asociados a cada valor.

## Ventajas
- **Solo es posible usar los valores definidos en el enum**, evitando datos inválidos.
- **Organización,** agrupan valores relacionados en una sola estructura.
- **Compatibilidad con `switch`**
- **Pueden tener lógica interna.** Permiten incluir atributos, métodos y comportamiento diferente por valor.
- **Fáciles de iterar** con el método `.values()`

## ¿Cuándo debería usarlos?

Se debe usar enums cuando es necesario representar un **conjunto fijo y limitado de valores** que no van a cambiar durante la ejecución del programa. Son ideales para casos como:

- **Estados de un proceso** (ej. `PENDIENTE`, `APROBADO`, `RECHAZADO`)
- **Roles de usuario** (ej. `ADMIN`, `CLIENTE`)
- **Días de la semana, colores, tipos de documento, etc.**

### Estructura del repositorio

- `src/Enums/basic/`: Ejercicios introductorios para entender la sintaxis y uso básico de enums.
- `src/Enums/middle/`: Ejercicios intermedios con lógica y estructuras más complejas.
- `src/Enums/advanced/example1/`: Ejemplo práctico con lógica avanzada y enums con atributos y métodos.
- `src/Enums/Old_Exercises/`: Ejercicios antiguos, menos pulidos o desactualizados. Pueden contener errores.
___
# Enums in Java
## What are enums?
They are a special type of class in Java that allow you to create your own custom data type, with the particularity that this type can only take one of the predefined values within the enum. These values are constants and cannot change at runtime.

## What are enums used for?
They are used to represent a limited set of possible values, such as roles, states, or types within a program.

Enums improve code readability and help prevent errors caused by misspelled or invalid values. In addition, they can contain internal logic, allowing attributes and methods to be defined for each value.

## Advantages
- **Only the values defined in the enum can be used**, avoiding invalid data.
- **Organization**, they group related values in a single structure.
- **Compatible with** `switch`
- **They can have internal logic**. You can include attributes, methods, and different behavior for each value.
- **Easy to iterate** using the `.values()` method.

## When should I use them?
Enums should be used when you need to represent a fixed and limited set of values that will not change during the program's execution. They are ideal for cases such as:

- **Process states** (e.g. `PENDING`, `APPROVED`, `REJECTED`)
- **User roles** (e.g. `ADMIN`, `CLIENT`)
- **Days of the week, colors, document types, etc.**

### Repository structure

- `src/Enums/basic/`: Introductory exercises to understand the basic syntax and use of enums.
- `src/Enums/middle/`: Intermediate exercises with more complex logic and structures.
- `src/Enums/advanced/example1/`: Practical example with advanced logic and enums with attributes and methods.
- `src/Enums/Old_Exercises/`: Older, less polished or outdated exercises. May contain errors or not follow best practices.