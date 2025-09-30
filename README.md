# HelloWorld - Unidad 1: Introducción a Android

Este proyecto corresponde a la **Unidad 1: Introducción a Android**. Se trata de una aplicación sencilla desarrollada en **Kotlin**, que utiliza **vistas XML** para la interfaz de usuario (no Jetpack Compose).

La aplicación incluye:

* **Dos `TextView`** con mensajes diferentes.
* **Un `Button`** que, al pulsarlo, muestra un **Toast** en pantalla.

---

## 📌 Objetivos de Aprendizaje

* Crear interfaces de usuario mediante ficheros XML.
* Conocer y modificar atributos en componentes `View`.
* Comprender el uso de `findViewById` para enlazar vistas con el código Kotlin.
* Cambiar propiedades de los componentes (`text`, `textColor`, etc.).
* Aprender el concepto de **Context** en Android.
* Generar eventos `onClick` y manejarlos con `OnClickListener`.
* Documentar el código con comentarios en XML y Kotlin.
* Publicar un proyecto en **GitHub** y compartirlo como repositorio privado.

---

## 🖼️ Diseño de la interfaz (TAREA 1)

El layout se encuentra en:

```
app/src/main/res/layout/activity_main.xml
```

Ejemplo de código en XML:

```xml
<TextView
    android:id="@+id/textView1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hola Mundo!"
    android:textColor="@android:color/white"
    android:textSize="20sp"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintStart_toStartOf="parent"/>

<TextView
    android:id="@+id/textView2"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="¡Hoy será un gran día!"
    android:textColor="@android:color/holo_blue_light"
    android:textSize="18sp"
    app:layout_constraintTop_toBottomOf="@id/textView1"
    app:layout_constraintStart_toStartOf="parent"/>

<Button
    android:id="@+id/button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Pulsa aquí"
    app:layout_constraintTop_toBottomOf="@id/textView2"
    app:layout_constraintStart_toStartOf="parent"/>
```

---

## ⚙️ Lógica de la aplicación (TAREA 2)

Archivo principal:

```
app/src/main/java/com/example/helloworld/MainActivity.kt
```

Ejemplo de código en Kotlin:

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignar vistas con findViewById
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val button: Button = findViewById(R.id.button)

        // Cambiar propiedades de los TextView
        textView1.setTextColor(Color.WHITE)
        textView2.text = "¡Sigue aprendiendo Android!"

        // Listener del botón
        button.setOnClickListener {
            Toast.makeText(this, "Has pulsado el botón 🚀", Toast.LENGTH_SHORT).show()
        }
    }
}
```

---

## 📝 Comentarios en el código (TAREA 3)

* Los **ficheros XML** incluyen comentarios explicando cada componente (`<!-- Comentario -->`).
* El código Kotlin contiene comentarios en línea `//` y bloques `/* ... */` describiendo los cambios realizados.

---

## 📂 Publicación en GitHub (TAREA 4)

Repositorio creado en GitHub con el nombre **HelloWorld**.

### Pasos realizados:

1. Crear repositorio privado en GitHub.
2. Subir el proyecto Android Studio.
3. Añadir como colaborador a `@moronlu18`.

📎 [Documentación oficial de Android Developers](https://developer.android.com/develop)

---

## ✅ Requisitos de entrega

El archivo final a entregar será un PDF con el nombre:

```
AEA01_Nombre_Apellidos.pdf
```

Este contendrá:

1. Nombre de usuario de GitHub.
2. Enlace al repositorio creado.
