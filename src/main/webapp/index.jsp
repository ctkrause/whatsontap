<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Home</title>

    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <link href="styles.css" rel="stylesheet">
</head>
<body>
<div class="container p-4">
    <div class="jumbotron text-center p-2">
        <h1 class="display-1">Madison On Tap</h1>
        <p class="lead">The API for searching and updating beers on tap at restaurants in the Atwood area of Madison, Wisconsin</p>
    </div>

    <div class="container">
        <table class="table table-bordered table-hover caption-top">
            <caption class="text-dark">Get All</caption>
            <tr>
                <th>Method</th>
                <th>Endpoints</th>
                <th>Description</th>
                <th>Example</th>
            </tr>
            <tr>
                <td>GET</td>
                <td>/taps/</td>
                <td>Retrieve all tap listings</td>
                <td>Returns all tap listings: <a href="http://3.141.155.98:8080/madisonontap/whatsontap/taps">
                    http://3.141.155.98:8080/madisonontap/whatsontap/taps</a></td>
            </tr>
        </table>

        <table class="table table-bordered table-hover caption-top">
            <caption class="text-dark">Get By ID</caption>
            <tr>
                <th>Method</th>
                <th>Endpoints</th>
                <th>Description</th>
                <th>Example</th>
            </tr>
            <tr>
                <td>GET</td>
                <td>/taps/id/{id}</td>
                <td>Retrieve specific tap listing by ID</td>
                <td>Returns the listing with an ID of 1: <a href="http://3.141.155.98:8080/madisonontap/whatsontap/taps/id/1">
                    http://3.141.155.98:8080/madisonontap/whatsontap/taps/id/1</a></td>
            </tr>
        </table>

        <table class="table table-bordered table-hover caption-top">
            <caption class="text-dark">Add New Tap</caption>
            <tr>
                <th>Method</th>
                <th>Endpoints</th>
                <th>Description</th>
            </tr>
            <tr>
                <td>POST</td>
                <td>/taps/</td>
                <td>Add new tap listing to MadisonOnTap database</td>
            </tr>
        </table>

        <table class="table table-bordered table-hover caption-top">
            <caption class="text-dark">Update Tap</caption>
            <tr>
                <th>Method</th>
                <th>Endpoints</th>
                <th>Description</th>
            </tr>
            <tr>
                <td>PUT</td>
                <td>/taps/</td>
                <td>Updates the contents of an existing tap listing</td>
            </tr>
        </table>

        <table class="table table-bordered table-hover caption-top">
            <caption class="text-dark">Delete Tap</caption>
            <tr>
                <th>Method</th>
                <th>Endpoints</th>
                <th>Description</th>
                <th>Example</th>
            </tr>
            <tr>
                <td>DELETE</td>
                <td>/taps/id/{id}</td>
                <td>Delete specific tap listing by ID</td>
                <td>URL to delete the listing with an ID of 1: <a href="http://3.141.155.98:8080/madisonontap/whatsontap/taps/id/1">
                    http://3.141.155.98:8080/madisonontap/whatsontap/taps/id/1</a></td>
            </tr>
        </table>
    </div>

    <div class="container text-center m-4">
        <h2 class="p-2">Links for Complete Documentation and GitHub:</h2>
            <div class="btn btn-success p-2 m-1">
                <a href="https://app.swaggerhub.com/apis-docs/madisonontap/madisonontap/1.0.0" class="text-decoration-none text-white">
                    Documentation</a>
            </div>

            <div class="btn btn-success text-decoration-none text-white p-2 m-1">
                <a href="https://github.com/ctkrause/whatsontap" class="text-decoration-none text-white">GitHub</a>
            </div>
    </div>
</div>
</body>
</html>