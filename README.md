# 🧪 Java Test Unitarios

![Ana Belén Programadora junior](https://github.com/user-attachments/assets/0689eb7b-2363-4f44-9afa-f3bb2ad267ae)

## 📋 Descripción

Proyecto de **pruebas unitarias en Java** desarrollado para aprender y practicar testing con JUnit 5. Incluye ejemplos prácticos de diferentes tipos de pruebas unitarias con Spring Boot.

## 🛠️ Tecnologías

- **Java 21** - Lenguaje de programación
- **Spring Boot 3.3.4** - Framework de aplicación
- **JUnit 5.11.2** - Framework de testing
- **Maven** - Gestión de dependencias

## 🧪 Funcionalidades de Testing

El proyecto incluye una clase `Example` con métodos que cubren diferentes aspectos de testing:

### Operaciones Matemáticas
- ✅ Suma de números
- ✅ Cálculo de factorial
- ✅ Verificación de números primos

### Validaciones
- ✅ Verificación de números positivos
- ✅ Manejo de excepciones (IllegalArgumentException)

### Manipulación de Strings
- ✅ Conteo de letras específicas
- ✅ Reversión de cadenas

### Manejo de Listas
- ✅ Verificación de elementos en listas
- ✅ Conversión de tipos de datos

### Operaciones Asíncronas
- ✅ Simulación de retrasos con Thread.sleep()

## 🚀 Cómo Ejecutar

```bash
# Clonar el repositorio
git clone https://github.com/AnaBHernandez/Junit-tests.git

# Navegar al directorio
cd Junit-tests

# Ejecutar las pruebas
mvn test

# Compilar el proyecto
mvn compile

# Ejecutar la aplicación
mvn spring-boot:run
```

## 📊 Resultados de Testing

- **Total de pruebas**: 12
- **Pruebas exitosas**: 12 ✅
- **Fallos**: 0 ❌
- **Tiempo de ejecución**: ~5 segundos

## 📁 Estructura del Proyecto

```
src/
├── main/java/org/factoriaf5/example/
│   ├── Example.java              # Clase principal con métodos de prueba
│   └── ExampleApplication.java   # Aplicación Spring Boot
└── test/java/org/factoriaf5/example/
    ├── ExampleTest.java          # 11 pruebas unitarias
    └── ExampleApplicationTests.java # Prueba de integración
```

## 🎯 Objetivos de Aprendizaje

- Práctica de testing unitario con JUnit 5
- Implementación de diferentes tipos de pruebas
- Manejo de excepciones en testing
- Configuración de proyectos Maven/Spring Boot
- Buenas prácticas de testing en Java

## 👩‍💻 Autor

**Ana Belén Hernández** - Programadora Junior

## 📝 Licencia

Este proyecto es de uso educativo y de aprendizaje.

---

⭐ **¡Dale una estrella si te resulta útil para aprender testing en Java!**