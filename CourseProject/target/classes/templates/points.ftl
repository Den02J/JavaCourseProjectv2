<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body style="background: #212529">

<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark" style="font-size: 20px;">
    <a class="navbar-brand ml-2" href="#">Navbar</a>

    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/students/view">View page</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/students/">Student page</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/students/examinerView">Examiner page</a>
            </li>
        </ul>
    </div>
    <a class="navbar-brand mr-2" href="/students/estimate/${student.id}">Estimate</a>
</nav>

<div>
    <table class="table table-hover table-dark" style="text-align: center">
            <tr>
                <td>Examiner</td>
                <td>${student.examiner}</td>
            </tr>

            <tr>
                <td>Subject 1</td>
                <td>${student.points1}</td>
            </tr>

            <tr>
                <td>Subject 2</td>
                <td>${student.points2}</td>
            </tr>

            <tr>
                <td>Subject 3</td>
                <td>${student.points3}</td>
            </tr>
    </table>

</div>
</body>
</html>