<%-- 
    Document   : index
    Created on : 05/09/2021, 01:00:29 AM
    Author     : Armando Mejia, Cynthia Goicochea, Cynthia Cáceres y Luis Miguel  :)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>La Ollita pe</title>
    <link rel="stylesheet" href="style.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css"
    />
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"
      charset="utf-8"
    ></script>
  </head>
  <body>
    <input type="checkbox" id="check" />
    <!--header area start-->
    <header>
      <label for="check">
        <i class="fas fa-bars" id="sidebar_btn"></i>
      </label>
      <div class="left_area">
        <img src="la_ollita_pe_logo.png" class="profile_image" alt="" />
        <!--h3>Coding <span>Snow</span></h3>-->
      </div>
      <div class="right_area">
        <a href="#" class="logout_btn">Cerrar Sesión</a>
      </div>
    </header>
    <!--header area end-->
    <!--mobile navigation bar start-->
    <div class="mobile_nav">
      <div class="nav_bar">
        <img src="1.jpg" class="mobile_profile_image" alt="" />
        <i class="fa fa-bars nav_btn"></i>
      </div>
      <div class="mobile_nav_items">
        <a href="#"><i class="fas fa-desktop"></i><span>Inicio</span></a>
        <a href="#"><i class="fas fa-cogs"></i><span>Menú</span></a>
        <a href="listar.jsp"><i class="fas fa-table"></i><span>Crud de Categorías</span></a>
        <a href="listar_tipocomida.jsp"><i class="fas fa-th"></i><span>Crud de comida</span></a>
        <a href="listar_insumo.jsp"><i class="fas fa-info-circle"></i><span>Crud de Insumos</span></a>
        <a href="#"
          ><i class="fas fa-sliders-h"></i><span>Configuración</span></a
        >
      </div>
    </div>
    <!--mobile navigation bar end-->
    <!--sidebar start-->
    <div class="sidebar">
      <div class="profile_info">
        <img src="1.jpg" class="profile_image" alt="" />
        <h4>GM Team</h4>
      </div>
      <a href="#"><i class="fas fa-desktop"></i><span>Inicio</span></a>
      <a href="#"><i class="fas fa-cogs"></i><span>Menú</span></a>
      <a href="listar.jsp"><i class="fas fa-table"></i><span>Crud de Categorías</span></a>
      <a href="listar_tipocomida.jsp"><i class="fas fa-th"></i><span>Crud de Comida</span></a>
      <a href="listar_insumo.jsp"><i class="fas fa-info-circle"></i><span>Crud de Insumos</span></a>
      <a href="#"><i class="fas fa-sliders-h"></i><span>Configuración</span></a>
    </div>
    <!--sidebar end-->

    <div class="content">
      <div class="card">
        <p>
          Lorem Ipsum is simply dummy text of the printing and typesetting
          industry. Lorem Ipsum has been the industry's standard dummy text ever
          since the 1500s, when an unknown printer took a galley of type and
          scrambled it to make a type specimen book. It has survived not only
          five centuries, but also the leap into electronic typesetting,
          remaining essentially unchanged.
        </p>
      </div>
      <div class="card">
        <p>
          Lorem Ipsum is simply dummy text of the printing and typesetting
          industry. Lorem Ipsum has been the industry's standard dummy text ever
          since the 1500s, when an unknown printer took a galley of type and
          scrambled it to make a type specimen book. It has survived not only
          five centuries, but also the leap into electronic typesetting,
          remaining essentially unchanged.
        </p>
      </div>
      <div class="card">
        <p>
          Lorem Ipsum is simply dummy text of the printing and typesetting
          industry. Lorem Ipsum has been the industry's standard dummy text ever
          since the 1500s, when an unknown printer took a galley of type and
          scrambled it to make a type specimen book. It has survived not only
          five centuries, but also the leap into electronic typesetting,
          remaining essentially unchanged.
        </p>
      </div>
    </div>

    <script type="text/javascript">
      $(document).ready(function () {
        $(".nav_btn").click(function () {
          $(".mobile_nav_items").toggleClass("active");
        });
      });
    </script>
  </body>
</html>
