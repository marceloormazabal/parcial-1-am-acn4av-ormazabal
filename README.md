# parcial-1-am-acn4av-ormazabal

# Marceapp – Parcial 1 (Aplicaciones Móviles)

**Alumno:** Ormazabal Marcelo (acn4av)  DNI: 29356069
**Repositorio:** 

## ✅ Requisitos del parcial y cómo se cumplen

- **Layout con ConstraintLayout + LinearLayout**  
  `activity_main.xml` usa `ConstraintLayout` como raíz y un `LinearLayout` **horizontal** (`llInputRow`) para `EditText + Button`.

- **Componentes**  
  `TextView` (título), `Button` (Agregar), `ImageView` (vector `ic_banner`).

- **1 Evento implementado**  
  Click en el botón **Agregar** → llama a `addTask()`.

- **Elemento dinámico en Java**  
  En `MainActivity.addTask()` se crea un `TextView` por cada tarea y se agrega a `containerTasks` (un `LinearLayout` dentro de un `ScrollView`).

- **Comportamiento extra (opcional)**
    - Click en una tarea: **tachar / destachar** (`STRIKE_THRU_TEXT_FLAG`).
    - Long click en una tarea: **eliminar**.

## 🧩 Estructura principal

- `app/src/main/res/layout/activity_main.xml`  
  Raíz `ConstraintLayout` con:
    - `TextView` título (`tvTitle`)
    - `ImageView` banner vector (`ic_banner`)
    - `LinearLayout` horizontal (`llInputRow`) con `EditText` + `Button`
    - `ScrollView` con `LinearLayout` vertical (`containerTasks`) para ítems dinámicos

- `app/src/main/java/.../MainActivity.java`  
  Lógica: agregar, tachar y eliminar tareas.

- Recursos en `app/src/main/res/values/`
    - `strings.xml`: textos (`title`, `hint_task`, `btn_add`, `img_desc`).
    - `colors.xml`: colores del tema (`color_texto`, `color_fondo`).
    - `dimens.xml`: espacios y tamaños (`space_8`, `space_12`, `space_16`, `texto_grande`).

## ▶️ Cómo ejecutar

1. Abrir el proyecto en **Android Studio**.
2. Elegir un emulador o dispositivo físico.
3. **Run ▶**.
4. Escribir una tarea y presionar **Agregar**.
    - Tocar la tarea → se **tacha**.
    - Mantener presionada → se **borra**.

## 👤 Autor
Ormazabal Marcelo — **acn4av** DNI: 29356069
