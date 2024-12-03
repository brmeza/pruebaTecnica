
# Prueba Técnica: Servicio de Usuarios y Validación de Palíndromos

Este proyecto es un microservicio desarrollado en **Spring Boot** que contiene dos funcionalidades principales:
1. **Consumo de Usuarios:** Recupera una lista de usuarios desde una API externa y los almacena en caché para optimización.
2. **Validación de Palíndromos:** Permite verificar si una cadena es un palíndromo, calcular su longitud y contar los caracteres especiales.


## 🚀 Características
- **Validación de Palíndromos:** Determina si una cadena es un palíndromo, calcula la longitud de la cadena y cuenta los caracteres especiales.
- **Cálculo de longitud:** Calcula la longitud total de la cadena.
- **Contador de caracteres especiales:** Cuenta los caracteres especiales en la cadena.
- **Recuperación de Usuarios:** Consume una API externa para recuperar usuarios y almacenarlos en caché.
- **Caché de usuarios:** Utiliza **Caffeine** para almacenar la lista de usuarios en caché durante 5 minutos, mejorando la eficiencia.
- **Manejo de errores global:** Excepciones personalizadas y respuesta en formato JSON.

---

## 📋 Requisitos

- **Java 17**.
- **Maven 3.8+**.
- **Spring Boot 3.4.0**.

---

## 🛠 Configuración del Proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/brmeza/pruebaTecnica.git
   cd pruebaTecnica
   ```

2. Compila el proyecto con Maven:
   ```bash
   mvn clean install
   ```

3. Inicia la aplicación:
   ```bash
   mvn spring-boot:run
   o directo desde tu IDE de preferencia 
   ```

---

## 📡 Uso de los Endpoints

### Validación de Palíndromos
**URL Base:**
```
http://localhost:8080/api/palindrome
```

**Ejemplo de JSON de Entrada:**
```json
{
  "cadena": "anita lava la tina"
}
```

**Ejemplo de JSON de Salida:**
```json
{
  "lengthCadena": 30,
  "isPalindromo": true,
  "lengthCaracteresEspeciales": 7
}
```
**POSTMAN**
![image](https://github.com/user-attachments/assets/b1efc99a-fd69-42c3-81e8-d14c327fad1f)

---

### Recuperación de Usuarios
**URL Base:**
```
http://localhost:8080/api/users
```

**Ejemplo de JSON de Salida:**
![image](https://github.com/user-attachments/assets/563acbc8-4461-4702-bf11-414e375645a1)

---

## 🧪 Pruebas Unitarias
Para ejecutar las pruebas unitarias:
```bash
mvn test
```

---
