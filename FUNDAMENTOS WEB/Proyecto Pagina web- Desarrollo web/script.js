/* =====================================================
   GAMEZONE
   SISTEMA DE NOTICIAS + LOGIN
===================================================== */


/* =====================================================
   CUENTA DE PRUEBA
===================================================== */

const usuarioAdmin = {
    usuario: "admin",
    password: "1234",
    nombre: "Administrador"
};


/* =====================================================
   VARIABLES
===================================================== */

let noticias = [];

let categoriaActual = "Todas";

let editando = false;


/* =====================================================
   NOTICIAS INICIALES
===================================================== */

const noticiasIniciales = [

    {
        id: 1,
        title: "La nueva generación de videojuegos promete grandes novedades",
        category: "Noticias",
        author: "GameZone",
        date: "05/10/2026",
        image: "https://images.unsplash.com/photo-1542751371-adc38448a05e?auto=format&fit=crop&w=1200&q=80",
        content: "La industria de los videojuegos continúa evolucionando rápidamente. Los desarrolladores están trabajando en nuevas experiencias que prometen mejorar la calidad gráfica, la jugabilidad y la interacción de los jugadores.",
        likes: 24
    },

    {
        id: 2,
        title: "Los grandes lanzamientos que llegarán próximamente",
        category: "Lanzamientos",
        author: "Carlos Gamer",
        date: "04/10/2026",
        image: "https://images.unsplash.com/photo-1511512578047-dfb367046420?auto=format&fit=crop&w=1200&q=80",
        content: "Los próximos meses estarán cargados de nuevos videojuegos. Diferentes estudios ya preparan grandes lanzamientos para PC y consolas.",
        likes: 17
    },

    {
        id: 3,
        title: "Los jugadores de PC esperan grandes novedades",
        category: "PC",
        author: "Laura Gaming",
        date: "03/10/2026",
        image: "https://images.unsplash.com/photo-1593305841991-05c297ba4575?auto=format&fit=crop&w=1200&q=80",
        content: "El mercado de PC continúa creciendo y cada año aparecen nuevos títulos que aprovechan las capacidades de los equipos modernos.",
        likes: 31
    },

    {
        id: 4,
        title: "PlayStation prepara nuevas experiencias para sus jugadores",
        category: "PlayStation",
        author: "GameZone",
        date: "02/10/2026",
        image: "https://images.unsplash.com/photo-1607853202273-797f1c22a38e?auto=format&fit=crop&w=1200&q=80",
        content: "La comunidad de PlayStation permanece atenta a las próximas novedades y anuncios relacionados con la plataforma.",
        likes: 42
    },

    {
        id: 5,
        title: "Xbox continúa ampliando su catálogo de videojuegos",
        category: "Xbox",
        author: "Andrés Play",
        date: "01/10/2026",
        image: "https://images.unsplash.com/photo-1621259182978-fbf93132d53d?auto=format&fit=crop&w=1200&q=80",
        content: "Xbox continúa apostando por ampliar su catálogo y ofrecer nuevas experiencias a los jugadores.",
        likes: 19
    },

    {
        id: 6,
        title: "Nintendo sorprende a su comunidad con nuevas novedades",
        category: "Nintendo",
        author: "GameZone",
        date: "30/09/2026",
        image: "https://images.unsplash.com/photo-1578303512597-81e6cc155b3e?auto=format&fit=crop&w=1200&q=80",
        content: "Nintendo continúa trabajando en nuevas experiencias para sus jugadores y mantiene a su comunidad pendiente de sus próximos anuncios.",
        likes: 36
    }

];


/* =====================================================
   INICIO
===================================================== */

document.addEventListener(
    "DOMContentLoaded",
    function () {

        cargarNoticias();

        mostrarNoticiasEnPantalla();

        mostrarDestacada();

        cargarTema();

        configurarFormulario();

        actualizarSesion();

    }
);


/* =====================================================
   LOCAL STORAGE - NOTICIAS
===================================================== */

function cargarNoticias() {

    const datos =
        localStorage.getItem("gamezone_noticias");


    if (datos) {

        noticias =
            JSON.parse(datos);

    } else {

        noticias =
            noticiasIniciales;

        guardarNoticias();

    }

}


function guardarNoticias() {

    localStorage.setItem(
        "gamezone_noticias",
        JSON.stringify(noticias)
    );

}


/* =====================================================
   LOGIN
===================================================== */

function abrirLogin() {

    const modal =
        document.getElementById("loginOverlay");

    modal.classList.add("active");

    document.body.style.overflow =
        "hidden";


    document
        .getElementById("loginUser")
        .focus();

}


function cerrarLogin() {

    const modal =
        document.getElementById("loginOverlay");

    modal.classList.remove("active");

    document.body.style.overflow =
        "";


    document
        .getElementById("loginForm")
        .reset();


    const error =
        document.getElementById("loginError");

    error.classList.remove("active");

    error.textContent = "";

}


/* =====================================================
   INICIAR SESIÓN
===================================================== */

function iniciarSesion(event) {

    event.preventDefault();


    const usuario =
        document
            .getElementById("loginUser")
            .value
            .trim();


    const password =
        document
            .getElementById("loginPassword")
            .value;


    const error =
        document
            .getElementById("loginError");


    if (
        usuario === usuarioAdmin.usuario &&
        password === usuarioAdmin.password
    ) {

        localStorage.setItem(
            "gamezone_sesion",
            JSON.stringify({
                usuario:
                    usuarioAdmin.usuario,

                nombre:
                    usuarioAdmin.nombre
            })
        );


        cerrarLogin();

        actualizarSesion();


        alert(
            "¡Bienvenido a GameZone, " +
            usuarioAdmin.nombre +
            "!"
        );


    } else {

        error.textContent =
            "Usuario o contraseña incorrectos.";

        error.classList.add("active");

    }

}


/* =====================================================
   ACTUALIZAR SESIÓN
===================================================== */

function actualizarSesion() {

    const sesion =
        localStorage.getItem(
            "gamezone_sesion"
        );


    const userSession =
        document.getElementById(
            "userSession"
        );


    const loginButton =
        document.getElementById(
            "loginButton"
        );


    const userName =
        document.getElementById(
            "userName"
        );


    const newsForm =
        document.getElementById(
            "newsForm"
        );


    const loginRequired =
        document.getElementById(
            "loginRequired"
        );


    if (sesion) {

        const usuario =
            JSON.parse(sesion);


        userSession.classList.add(
            "active"
        );


        loginButton.style.display =
            "none";


        userName.textContent =
            "👤 " + usuario.nombre;


        newsForm.classList.remove(
            "hidden"
        );


        loginRequired.classList.add(
            "hidden"
        );


    } else {

        userSession.classList.remove(
            "active"
        );


        loginButton.style.display =
            "block";


        newsForm.classList.add(
            "hidden"
        );


        loginRequired.classList.remove(
            "hidden"
        );

    }

    if (sesion) {
        const usuario = JSON.parse(sesion);

        userSession.classList.add("active");
        loginButton.style.setProperty("display", "none", "important");

        userName.textContent = "👤 " + usuario.nombre;
    } else {
        userSession.classList.remove("active");
        loginButton.style.setProperty("display", "block", "important");
    }

}


/* =====================================================
   CERRAR SESIÓN
===================================================== */

function cerrarSesion() {

    const confirmar =
        confirm(
            "¿Quieres cerrar tu sesión?"
        );


    if (!confirmar) {
        return;
    }


    localStorage.removeItem(
        "gamezone_sesion"
    );


    cancelarEdicion();

    actualizarSesion();


    alert(
        "Has cerrado sesión correctamente."
    );

}


/* =====================================================
   COMPROBAR SESIÓN
===================================================== */

function estaLogueado() {

    return (
        localStorage.getItem(
            "gamezone_sesion"
        ) !== null
    );

}


function comprobarPublicacion() {

    if (!estaLogueado()) {

        abrirLogin();

        return;

    }


    mostrarFormulario();

}


/* =====================================================
   MOSTRAR NOTICIAS
===================================================== */

function mostrarNoticiasEnPantalla() {

    const grid =
        document.getElementById(
            "newsGrid"
        );


    const noResults =
        document.getElementById(
            "noResults"
        );


    const search =
        document
            .getElementById(
                "searchInput"
            )
            .value
            .toLowerCase()
            .trim();


    let resultado =
        noticias.filter(
            noticia => {

                const coincideCategoria =
                    categoriaActual === "Todas" ||
                    noticia.category ===
                    categoriaActual;


                const coincideBusqueda =
                    noticia.title
                        .toLowerCase()
                        .includes(search) ||

                    noticia.content
                        .toLowerCase()
                        .includes(search) ||

                    noticia.author
                        .toLowerCase()
                        .includes(search);


                return (
                    coincideCategoria &&
                    coincideBusqueda
                );

            }
        );


    grid.innerHTML = "";


    if (resultado.length === 0) {

        noResults.style.display =
            "block";

        return;

    }


    noResults.style.display =
        "none";


    resultado.forEach(
        noticia => {

            grid.appendChild(
                crearTarjeta(noticia)
            );

        }
    );

}


/* =====================================================
   CREAR TARJETA
===================================================== */

function crearTarjeta(noticia) {

    const card =
        document.createElement(
            "article"
        );


    card.className =
        "news-card";


    const imagen =
        noticia.image ||
        "https://images.unsplash.com/photo-1511512578047-dfb367046420?auto=format&fit=crop&w=1000&q=80";


    let botonesAdmin = "";


    if (estaLogueado()) {

        botonesAdmin = `

            <button
                class="edit-btn"
                onclick="editarNoticia(${noticia.id})"
                title="Editar">

                ✏️

            </button>


            <button
                class="delete-btn"
                onclick="eliminarNoticia(${noticia.id})"
                title="Eliminar">

                🗑️

            </button>

        `;

    }


    card.innerHTML = `

        <div class="news-image-container">

            <img
                class="news-image"
                src="${escaparHTML(imagen)}"
                alt="${escaparHTML(noticia.title)}"
                onerror="this.src='https://images.unsplash.com/photo-1511512578047-dfb367046420?auto=format&fit=crop&w=1000&q=80'"
            >

            <span class="news-category">

                ${escaparHTML(
        noticia.category
    )}

            </span>

        </div>


        <div class="news-content">

            <h3>
                ${escaparHTML(
        noticia.title
    )}
            </h3>


            <p>
                ${escaparHTML(
        noticia.content
    )}
            </p>


            <div class="news-meta">

                Por

                <strong>
                    ${escaparHTML(
        noticia.author
    )}
                </strong>

                ·

                ${escaparHTML(
        noticia.date
    )}

            </div>


            <div class="news-actions">

                <button
                    class="like-btn"
                    onclick="darLike(${noticia.id})">

                    ❤️ ${noticia.likes || 0}

                </button>


                <div>

                    <button
                        onclick="verNoticia(${noticia.id})"
                        title="Leer">

                        👁️

                    </button>

                    ${botonesAdmin}

                </div>

            </div>

        </div>

    `;


    return card;

}
/* =====================================================
   VARIABLES GLOBALES DEL MOTOR DEL SLIDER
===================================================== */
let slideActual = 0;
let totalSlides = 0;
let intervaloAutoplay = null;

/* =====================================================
   MOSTRAR DESTACADA CON TRANSLACIÓN Y CONTROLES
===================================================== */
function mostrarDestacada() {
    const contenedorSlider = document.getElementById("featuredNews");
    const contenedorDots = document.querySelector(".featured-slider-dots");

    if (!contenedorSlider || !contenedorDots) return;

    contenedorSlider.innerHTML = "";
    contenedorDots.innerHTML = "";

    if (noticias.length === 0) return;

    // Tomamos las primeras 4 noticias de tu arreglo dinámico
    const noticiasDestacadas = noticias.slice(0, 4);
    totalSlides = noticiasDestacadas.length;

    // Renderizamos las tarjetas y los puntos
    noticiasDestacadas.forEach((noticia, index) => {
        const tarjetaHTML = `
            <div class="featured-card">
                <img class="featured-card-image" src="${noticia.image}" alt="${noticia.title}">
                <div class="featured-overlay"></div>
                <div class="featured-content">
                    <span class="hero-tag">🔥 ${noticia.category.toUpperCase()}</span>
                    <h3>${noticia.title}</h3>
                    <p>${noticia.content}</p>
                </div>
            </div>
        `;
        contenedorSlider.insertAdjacentHTML("beforeend", tarjetaHTML);

        const dotHTML = `
            <a onclick="irAlSlide(${index})" class="${index === 0 ? 'dot-active' : ''}" title="Noticia ${index + 1}"></a>
        `;
        contenedorDots.insertAdjacentHTML("beforeend", dotHTML);
    });

    // Inicializamos las funciones de movimiento automático e interactividad
    slideActual = 0;
    actualizarPosicionSlider();
    iniciarAutoplay();

    // Eventos para pausar el autoplay al pasar el mouse por encima
    const wrapper = document.querySelector(".gz-pro-slider-container");
    wrapper.onmouseenter = pausarAutoplay;
    wrapper.onmouseleave = iniciarAutoplay;
}

/* =====================================================
   FUNCIONES DE CONTROL DE DESPLAZAMIENTO
===================================================== */
function actualizarPosicionSlider() {
    const contenedorSlider = document.getElementById("featuredNews");
    // Multiplica el índice por -100 para desplazar el riel hacia la izquierda
    contenedorSlider.style.transform = `translateX(-${slideActual * 100}%)`;

    // Actualiza los puntitos activos iluminados
    const dots = document.querySelectorAll(".featured-slider-dots a");
    dots.forEach((dot, index) => {
        if (index === slideActual) {
            dot.classList.add("dot-active");
        } else {
            dot.classList.remove("dot-active");
        }
    });
}

function slideSiguiente() {
    if (totalSlides <= 1) return;
    slideActual = (slideActual + 1) % totalSlides; // Si llega al final vuelve a 0
    actualizarPosicionSlider();
}

function slideAnterior() {
    if (totalSlides <= 1) return;
    slideActual = (slideActual - 1 + totalSlides) % totalSlides; // Si baja de 0 va al último
    actualizarPosicionSlider();
}

function irAlSlide(indice) {
    slideActual = indice;
    actualizarPosicionSlider();
}

/* =====================================================
   SISTEMA DE AUTOPLAY (REPRODUCCIÓN AUTOMÁTICA)
===================================================== */
function iniciarAutoplay() {
    if (totalSlides <= 1) return;
    pausarAutoplay(); // Previene duplicidad de timers
    intervaloAutoplay = setInterval(slideSiguiente, 5000); // Cambia de noticia cada 5 segundos
}

function pausarAutoplay() {
    if (intervaloAutoplay) {
        clearInterval(intervaloAutoplay);
    }
}




/* =====================================================
   BUSCAR
===================================================== */

function buscarNoticias() {

    mostrarNoticiasEnPantalla();

}


/* =====================================================
   CATEGORÍAS
===================================================== */

function filtrarCategoria(
    categoria,
    boton
) {

    categoriaActual =
        categoria;


    document
        .querySelectorAll(
            ".category"
        )
        .forEach(
            btn =>
                btn.classList.remove(
                    "active"
                )
        );


    boton.classList.add(
        "active"
    );


    mostrarNoticiasEnPantalla();

}


/* =====================================================
   LIKE
===================================================== */

function darLike(id) {

    const noticia =
        noticias.find(
            n => n.id === id
        );


    if (!noticia) return;


    noticia.likes =
        (noticia.likes || 0) + 1;


    guardarNoticias();

    mostrarNoticiasEnPantalla();

    mostrarDestacada();

}


/* =====================================================
   VER NOTICIA
===================================================== */

function verNoticia(id) {

    const noticia =
        noticias.find(
            n => n.id === id
        );


    if (!noticia) return;


    const modal =
        document.getElementById(
            "modalOverlay"
        );


    const content =
        document.getElementById(
            "modalContent"
        );


    const imagen =
        noticia.image ||
        "https://images.unsplash.com/photo-1511512578047-dfb367046420?auto=format&fit=crop&w=1200&q=80";


    content.innerHTML = `

        <img
            class="modal-image"
            src="${escaparHTML(imagen)}"
            alt="${escaparHTML(
        noticia.title
    )}">


        <div class="modal-body">

            <span class="news-category">

                ${escaparHTML(
        noticia.category
    )}

            </span>


            <h2>

                ${escaparHTML(
        noticia.title
    )}

            </h2>


            <div class="modal-meta">

                Publicado por

                <strong>
                    ${escaparHTML(
        noticia.author
    )}
                </strong>

                ·

                ${escaparHTML(
        noticia.date
    )}

                ·

                ❤️ ${noticia.likes || 0}

            </div>


            <p>

                ${escaparHTML(
        noticia.content
    )}

            </p>

        </div>

    `;


    modal.classList.add(
        "active"
    );


    document.body.style.overflow =
        "hidden";

}


/* =====================================================
   CERRAR MODAL
===================================================== */

function cerrarModal() {

    const modal =
        document.getElementById(
            "modalOverlay"
        );


    modal.classList.remove(
        "active"
    );


    document.body.style.overflow =
        "";

}


/* =====================================================
   CERRAR LOGIN CLICK FUERA
===================================================== */

document
    .getElementById(
        "loginOverlay"
    )
    .addEventListener(
        "click",
        function (event) {

            if (
                event.target ===
                this
            ) {

                cerrarLogin();

            }

        }
    );


/* =====================================================
   CERRAR NOTICIA CLICK FUERA
===================================================== */

document
    .getElementById(
        "modalOverlay"
    )
    .addEventListener(
        "click",
        function (event) {

            if (
                event.target ===
                this
            ) {

                cerrarModal();

            }

        }
    );


/* =====================================================
   FORMULARIO
===================================================== */

function configurarFormulario() {

    const form =
        document.getElementById(
            "newsForm"
        );


    form.addEventListener(
        "submit",
        function (event) {

            event.preventDefault();


            if (!estaLogueado()) {

                abrirLogin();

                return;

            }


            guardarNoticia();

        }
    );

}


/* =====================================================
   GUARDAR NOTICIA
===================================================== */

function guardarNoticia() {

    if (!estaLogueado()) {

        abrirLogin();

        return;

    }


    const id =
        document.getElementById(
            "editId"
        ).value;


    const titulo =
        document
            .getElementById(
                "title"
            )
            .value
            .trim();


    const categoria =
        document
            .getElementById(
                "category"
            ).value;


    const autor =
        document
            .getElementById(
                "author"
            )
            .value
            .trim();


    const imagen =
        document
            .getElementById(
                "image"
            )
            .value
            .trim();


    const contenido =
        document
            .getElementById(
                "content"
            )
            .value
            .trim();


    if (
        !titulo ||
        !categoria ||
        !autor ||
        !contenido
    ) {

        alert(
            "Completa todos los campos obligatorios."
        );

        return;

    }


    /* EDITAR */

    if (id) {

        const index =
            noticias.findIndex(
                noticia =>
                    noticia.id ===
                    Number(id)
            );


        if (index !== -1) {

            noticias[index].title =
                titulo;

            noticias[index].category =
                categoria;

            noticias[index].author =
                autor;

            noticias[index].image =
                imagen;

            noticias[index].content =
                contenido;

        }


        alert(
            "La noticia fue actualizada correctamente."
        );

    }


    /* NUEVA */

    else {

        const nuevaNoticia = {

            id: Date.now(),

            title: titulo,

            category: categoria,

            author: autor,

            date: obtenerFecha(),

            image: imagen,

            content: contenido,

            likes: 0

        };


        noticias.unshift(
            nuevaNoticia
        );


        alert(
            "¡La noticia fue publicada correctamente!"
        );

    }


    guardarNoticias();

    limpiarFormulario();

    mostrarNoticiasEnPantalla();

    mostrarDestacada();


    document
        .getElementById(
            "noticias"
        )
        .scrollIntoView({
            behavior: "smooth"
        });

}


/* =====================================================
   EDITAR
===================================================== */

function editarNoticia(id) {

    if (!estaLogueado()) {

        abrirLogin();

        return;

    }


    const noticia =
        noticias.find(
            n => n.id === id
        );


    if (!noticia) return;


    document
        .getElementById(
            "editId"
        ).value = noticia.id;


    document
        .getElementById(
            "title"
        ).value = noticia.title;


    document
        .getElementById(
            "category"
        ).value = noticia.category;


    document
        .getElementById(
            "author"
        ).value = noticia.author;


    document
        .getElementById(
            "image"
        ).value = noticia.image;


    document
        .getElementById(
            "content"
        ).value = noticia.content;


    document
        .getElementById(
            "formTitle"
        )
        .textContent =
        "Editar publicación";


    document
        .getElementById(
            "submitBtn"
        )
        .textContent =
        "💾 Guardar cambios";


    document
        .getElementById(
            "cancelBtn"
        )
        .style.display =
        "block";


    editando = true;


    mostrarFormulario();

}


/* =====================================================
   ELIMINAR
===================================================== */

function eliminarNoticia(id) {

    if (!estaLogueado()) {

        abrirLogin();

        return;

    }


    const noticia =
        noticias.find(
            n => n.id === id
        );


    if (!noticia) return;


    const confirmar =
        confirm(
            `¿Quieres eliminar "${noticia.title}"?`
        );


    if (!confirmar) return;


    noticias =
        noticias.filter(
            n => n.id !== id
        );


    guardarNoticias();

    mostrarNoticiasEnPantalla();

    mostrarDestacada();


    alert(
        "La noticia fue eliminada."
    );

}


/* =====================================================
   CANCELAR EDICIÓN
===================================================== */

function cancelarEdicion() {

    limpiarFormulario();

}


function limpiarFormulario() {

    document
        .getElementById(
            "newsForm"
        )
        .reset();


    document
        .getElementById(
            "editId"
        )
        .value = "";


    document
        .getElementById(
            "formTitle"
        )
        .textContent =
        "Crear publicación";


    document
        .getElementById(
            "submitBtn"
        )
        .textContent =
        "🚀 Publicar noticia";


    document
        .getElementById(
            "cancelBtn"
        )
        .style.display =
        "none";


    editando = false;

}


/* =====================================================
   FECHA
===================================================== */

function obtenerFecha() {

    const fecha =
        new Date();


    const dia =
        String(
            fecha.getDate()
        ).padStart(2, "0");


    const mes =
        String(
            fecha.getMonth() + 1
        ).padStart(2, "0");


    const año =
        fecha.getFullYear();


    return (
        dia +
        "/" +
        mes +
        "/" +
        año
    );

}


/* =====================================================
   NAVEGACIÓN
===================================================== */

function mostrarFormulario() {

    if (!estaLogueado()) {

        abrirLogin();

        return;

    }


    document
        .getElementById(
            "publicar"
        )
        .scrollIntoView({
            behavior: "smooth"
        });

}


function mostrarNoticias() {

    document
        .getElementById(
            "noticias"
        )
        .scrollIntoView({
            behavior: "smooth"
        });

}


function mostrarInicio() {

    window.scrollTo({

        top: 0,

        behavior: "smooth"

    });

}


/* =====================================================
   MENÚ MÓVIL
===================================================== */

function toggleMenu() {

    document
        .getElementById(
            "mobileMenu"
        )
        .classList.toggle(
            "active"
        );

}



function cambiarTema() {
    document.body.classList.toggle("light");

    const modoClaro = document.body.classList.contains("light");

    localStorage.setItem(
        "gamezone_tema",
        modoClaro ? "light" : "dark"
    );

    actualizarBotonTema();
}

function cargarTema() {
    const tema = localStorage.getItem("gamezone_tema");

    document.body.classList.toggle("light", tema === "light");

    actualizarBotonTema();
}

function actualizarBotonTema() {
    const boton = document.querySelector(".theme-btn");
    if (!boton) return;

    const modoClaro = document.body.classList.contains("light");

    boton.textContent = modoClaro ? "☀️" : "🌙";
    boton.title = modoClaro ? "Activar modo oscuro" : "Activar modo claro";
    boton.setAttribute("aria-label", boton.title);
}


/* =====================================================
   ESCAPAR HTML
===================================================== */

function escaparHTML(texto) {

    if (
        texto === undefined ||
        texto === null
    ) {

        return "";

    }


    return String(texto)

        .replace(
            /&/g,
            "&amp;"
        )

        .replace(
            /</g,
            "&lt;"
        )

        .replace(
            />/g,
            "&gt;"
        )

        .replace(
            /"/g,
            "&quot;"
        )

        .replace(
            /'/g,
            "&#039;"
        );

}


/* =====================================================
   TECLA ESC
===================================================== */

document.addEventListener(
    "keydown",
    function (event) {

        if (
            event.key ===
            "Escape"
        ) {

            cerrarModal();

            cerrarLogin();

        }

    }
);

