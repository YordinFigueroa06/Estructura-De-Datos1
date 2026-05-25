# 📚 Estructuras de Datos en Java: Pila (Stack) y Cola (Queue)

Este proyecto contiene la implementación de dos estructuras de datos fundamentales en Java aplicadas a casos reales:

* 🧭 Simulación de navegador (Pila – LIFO)
* 🖨️ Simulación de impresora (Cola – FIFO)

---

# 🧭 1. Simulación de Navegador (Pila - LIFO)

## 🎯 Objetivo

Simular el comportamiento de un navegador web utilizando una **pila**, donde se gestionan las páginas visitadas.

## 🧠 Concepto: LIFO (Last In, First Out)

El último elemento en entrar es el primero en salir.

Ejemplo real:
Cuando navegas en internet y presionas **"Atrás"**, vuelves a la última página visitada.

## ⚙️ Operaciones implementadas

* `push()` → Agregar una nueva página al historial
* `pop()` → Volver atrás (elimina la página actual)
* `peek()` → Ver la página actual sin eliminarla

## 💻 Funcionamiento

1. Se agregan páginas al historial:

   ```
   google.com → youtube.com → github.com
   ```

2. La pila queda:

   ```
   TOP → github.com
          youtube.com
          google.com
   ```

3. Al ejecutar `pop()`:

   * Se elimina `github.com`
   * Nueva página actual: `youtube.com`

4. Con `peek()`:

   * Se consulta la página actual sin eliminarla

## ✅ Aplicación real

* Navegadores web
* Historial de acciones (undo/redo)
* Sistemas de navegación

---

# 🖨️ 2. Simulación de Impresora (Cola - FIFO)

## 🎯 Objetivo

Simular el funcionamiento de una impresora gestionando documentos en orden de llegada.

## 🧠 Concepto: FIFO (First In, First Out)

El primer elemento en entrar es el primero en salir.

Ejemplo real:
En una impresora, el primer documento enviado es el primero en imprimirse.

## ⚙️ Operaciones implementadas

* `offer()` / `add()` → Agregar documento a la cola
* `poll()` → Procesar (imprimir) el documento
* `peek()` → Consultar el siguiente documento

## 💻 Funcionamiento

1. Se agregan documentos:

   ```
   Tarea.pdf → Foto.png → Informe.docx
   ```

2. La cola queda:

   ```
   FRENTE → Tarea.pdf → Foto.png → Informe.docx
   ```

3. Al ejecutar `poll()`:

   * Se imprime `Tarea.pdf`
   * La cola avanza

4. Con `peek()`:

   * Se consulta el siguiente documento sin eliminarlo

## ✅ Aplicación real

* Sistemas de impresión
* Procesamiento de tareas
* Atención por turnos

---

# ⚖️ Comparación entre Pila y Cola

| Característica  | Pila (Stack)     | Cola (Queue)       |
| --------------- | ---------------- | ------------------ |
| Orden           | LIFO             | FIFO               |
| Acceso          | Último elemento  | Primer elemento    |
| Uso común       | Navegación, undo | Impresoras, turnos |
| Operación clave | push / pop       | offer / poll       |

---


# 📌 Conclusión

* La **pila** es ideal cuando se necesita trabajar con el elemento más reciente.
* La **cola** es perfecta para procesar elementos en orden de llegada.
* Ambas estructuras son fundamentales en la programación y tienen múltiples aplicaciones en sistemas reales.

---

