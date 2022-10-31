<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
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
</nav>

<div style="width: 200px; margin: 50px auto; color: white; font-size: 16px;">
    <fieldset>
        <legend> Update student</legend>
        <form name="student" action="" method="POST">
            First Name<br>
            <@spring.formInput "form.firstName" "" "text"/>
            <br>
            <br>
            Last Name<br>
            <@spring.formInput "form.lastName" "" "text"/>
            <br>
            <br>
            Specialty<br>
            <@spring.formInput "form.specialty" "" "text"/>
            <br>
            <br>
            <div style="text-align: center">
                <input class="btn btn-light" type=submit value="Submit">
            </div>
        </form>

    </fieldset>
</div>
</body>
</html>