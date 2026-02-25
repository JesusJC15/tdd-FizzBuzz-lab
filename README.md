# Laboratorio: TDD con FizzBuzz en GitHub Codespaces
## Objetivo
Aplicar la metodología de Desarrollo Guiado por Pruebas (TDD) mediante la implementación del ejercicio clásico FizzBuzz en Java dentro de GitHub Codespaces.

## Requisitos Previos
- Cuenta en GitHub.
- Repositorio habilitado con GitHub Codespaces.
- Conocimientos básicos de Java.
- Familiaridad con TDD y JUnit.

## Configuración del Entorno
1. Clonar el repositorio en GitHub Codespaces:
2. Abre tu repositorio en GitHub.
3. Haz clic en el botón Code y selecciona Codespaces.
4. Inicia un nuevo Codespace o selecciona uno existente.

## Configurar el entorno de desarrollo:
1. Abre la terminal en Codespaces y ejecuta:
   - ```bash mkdir -p src/main/java src/test/java```
   - ```touch src/main/java/FizzBuzz.java src/test/java/FizzBuzzTest.java```
3. Agrega un archivo ```pom.xml``` para configurar Maven y JUnit.

## Paso 1: Escribir la primera prueba
Crea el archivo ```src/test/java/FizzBuzzTest.java``` y agrega la siguiente prueba inicial:
```
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
}
```

## Paso 2: Implementar la función mínima
Crea el archivo ```src/main/java/FizzBuzz.java``` y define la función:
```
public class FizzBuzz {
    public static String fizzbuzz(int n) {
        return String.valueOf(n);
    }
}
```
Ejecuta las pruebas con:
```mvn test```

## Paso 3: Agregar más pruebas y lógica
Añadir pruebas para los casos de múltiplos de 3 y 5 en ```FizzBuzzTest.java```:
```
@Test
void testFizzBuzzMultiplo3() {
    assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
}

@Test
void testFizzBuzzMultiplo5() {
    assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
}

@Test
void testFizzBuzzMultiplo3y5() {
    assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
}
```
Modifica ```FizzBuzz.java``` para pasar estas pruebas:

## Paso 4: Ejecutar y validar las pruebas
Corre nuevamente ```mvn test``` y verifica que todas las pruebas pasen.

## Descripción del Proyecto

### ¿Qué se implementó?

Este laboratorio aplica la metodología **TDD (Test-Driven Development)** para desarrollar la función clásica **FizzBuzz** en Java.

#### Lógica implementada (`FizzBuzz.java`)

La función `FizzBuzz.fizzbuzz(int n)` recibe un número entero y retorna:

| Condición | Resultado |
|---|---|
| Múltiplo de 3 y de 5 | `"FizzBuzz"` |
| Múltiplo de 3 | `"Fizz"` |
| Múltiplo de 5 | `"Buzz"` |
| Número ≤ 0 | El número como cadena de texto |
| Cualquier otro caso | El número como cadena de texto |

#### Pruebas implementadas (`FizzBuzzTest.java`)

Se desarrollaron **10 pruebas unitarias** siguiendo el ciclo TDD (Rojo → Verde → Refactorizar):

| Prueba | Entrada | Resultado esperado |
|---|---|---|
| `fizzbuzz_number1_returns1` | `1` | `"1"` |
| `fizzbuzz_multipleOf3_returnsFizz` | `3` | `"Fizz"` |
| `fizzbuzz_multipleOf5_returnsBuzz` | `5` | `"Buzz"` |
| `fizzbuzz_multipleOf3And5_returnsFizzBuzz` | `15` | `"FizzBuzz"` |
| `fizzbuzz_multipleOf3_6_returnsFizz` | `6` | `"Fizz"` |
| `fizzbuzz_multipleOf5_10_returnsBuzz` | `10` | `"Buzz"` |
| `fizzbuzz_zero_returnsZero` | `0` | `"0"` |
| `fizzbuzz_negativeMultipleOf3_returnsNegative3` | `-3` | `"-3"` |
| `fizzbuzz_negativeMultipleOf5_returnsNegative5` | `-5` | `"-5"` |
| `fizzbuzz_negativeMultipleOf3And5_returnsNegative15` | `-15` | `"-15"` |

#### Tecnologías utilizadas

- **Java 17**
- **JUnit Jupiter 5.9.3** — framework de pruebas unitarias
- **Maven** — gestión de dependencias y ciclo de vida del proyecto
- **GitHub Codespaces** — entorno de desarrollo en la nube

## Conclusión
Has aplicado TDD para desarrollar la función FizzBuzz. Sigue esta metodología para otros problemas y mejorarás la calidad de tu código.

## Siguientes Pasos
- Implementar pruebas adicionales.
- Refactorizar el código para mejorar su claridad.
- Integrar este flujo en un pipeline CI/CD en GitHub Actions.
