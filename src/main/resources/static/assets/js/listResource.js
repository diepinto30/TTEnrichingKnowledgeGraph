/**
 * Created by diepinto30 on 10/01/2020.
 */
// list resource
$(document).ready(function(){

    var urlData = "http://localhost:8085/rest/repository/api";
    console.log("en el script");
    var i = 0;
    $.ajax({
        //url: 'http://localhost:8085/app/api',
        url: urlData,
        type: "GET",
        dataType: "json",
        data: {},
        success: function (data, textStatus, xhr) {
            console.log("Toda los Datos registrados");
            console.log(data);
            var edadVacio = "None";
            var edadNone = "null";
            var div = '<h1>datos json</h1>';
            div += '';
            $("#tabla2").append(div);
            var modal = "";
            var tab = "";
            tab += "<table id='example' class='table table-striped table-hover display nowrap' style='width:100%'>";

            tab += "<thead class='thead-dark'>\n" +
                "    <tr>\n" +
                "        <th scope='col' >#</th>\n" +
                "        <th scope=col' class='select-filter'>origin</th>\n" +
                "        <th scope='col'>Name Repository</th>\n" +
                "        <th scope='col'>Resource</th>\n" +
                "        <th scope='col' >State</th>\n" +
                "    </tr>\n" +
                "    </thead>";
            console.log("idrepository");
            console.log(data[i].idrepository);


            $.each(data, function (ids, item) {
                console.log(data[i].idrepository);

                console.log("Todos los datos");
                tab += "<tr>";
                tab += "<td>" + data[i].idrepository + "</td>";
                tab += "<th>" + data[i].origin + "</th>";
                tab += "<th>" + data[i].nameRepository + "</th>";
                tab += "<th>" + data[i].resource + "</th>";
                tab += "<th>" + data[i].state + "</th>";
                tab += '</tr>';

                i++;

            });//end each ids

            $("#result").append(tab);
        },
        error: function (data) {
            alert("Error");
        }
    });//end ajax
});