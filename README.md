# 🏢 Repositorio de Testing - Municipio de Tres Arroyos

Bienvenido al repositorio central de Aseguramiento de la Calidad (QA) para los sistemas y plataformas digitales del **Municipio de Tres Arroyos**. Aquí se alojan los scripts de automatización, casos de prueba y datos de prueba para validar las aplicaciones municipales.

---

## ⚠️ AVISO DE PRIVACIDAD Y DATOS

> **🚨 IMPORTANTE: LEER ANTES DE CONTINUAR**
>
> **Todos los datos contenidos en este repositorio son EXCLUSIVO DE USO PARA PRUEBAS.**
>
> * **Datos Ficticios:** Toda información referente a personas, patentes, inmuebles o deudas es **simulada (mock data)**.
> * **Prohibición:** Está terminantemente prohibido subir, almacenar o utilizar bases de datos reales de contribuyentes en este repositorio.
> * **Seguridad:** Este entorno está aislado de los servidores de producción del municipio.

---

## 🎯 Objetivos del Repositorio

1.  **Asegurar la Calidad:** Validar que los sistemas (Web) funcionen correctamente antes de salir al público.
2.  **Automatización:** Reducir el trabajo manual mediante scripts de prueba recurrentes.
3.  **Documentación:** Mantener un registro claro de los casos de uso probados.

## 🛠️ Stack Tecnológico



* **Lenguaje:** [Ej: JavaScript / Java]
* **Framework de Testing:** [Selenium]
* **Gestión de Proyectos:** GitHub / GitLab
* **Entorno:** Eclipse - springboot -VStudio

## 📂 Estructura del Proyecto

```text
/
├── .github/workflows   # Pipelines de CI/CD              
├── docs/               # Documentación de casos de prueba
├── src/
|   |──gestionvehicular/
        └──GestionVehicularForm
│   ├── mainTest/          # Page Object Model (si aplica)
|      └──SearchGuardavidaMain
|      └──SearchMuni
|      └──SearchGestionVehicular
|      └──SitioOficinaEmpleo
│   ├── testAutomatizacion/     # Scripts de prueba organizados por módulo
│   │   ├── empleoFormtest
│   │   ├── empleoLoginTest
│   │   └── guardavidas
        └──SearchPageGuardavidaTest
        └──SearchPageMuniTest
│   └── utils/          # Funciones auxiliares
├── .gitignore          # Archivos ignorados
└── README.md           # Este archivo
