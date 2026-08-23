<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello Servlet</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body class="bg-slate-900 text-slate-100 min-h-screen flex items-center justify-center p-6">
    <div class="max-w-md w-full glass-card rounded-2xl shadow-2xl p-8 space-y-6">
        <div class="text-center space-y-2">
            <span class="inline-block px-3 py-1 text-xs font-semibold uppercase tracking-wider text-indigo-400 bg-indigo-950/80 rounded-full border border-indigo-500/30 badge-glow-indigo">
                Jakarta EE Servlet
            </span>
            <h1 class="text-3xl font-extrabold text-white tracking-tight">
                ${message}
            </h1>
        </div>

        <div class="bg-slate-900/80 rounded-xl p-5 border border-slate-700/50 space-y-2 text-center">
            <p class="text-sm font-medium text-slate-400 uppercase tracking-wider">Generated Number</p>
            <p class="text-xl mono-number font-bold text-emerald-400 break-all">
                ${number}
            </p>
        </div>

        <div class="pt-2 flex flex-col gap-3 text-center">
            <a href="index.jsp" class="btn-transition w-full inline-flex justify-center items-center px-4 py-2.5 rounded-lg text-sm font-medium text-white bg-indigo-600 hover:bg-indigo-500 transition-colors shadow-lg shadow-indigo-600/20">
                Back to Home
            </a>
            <a href="another-servlet" class="btn-transition w-full inline-flex justify-center items-center px-4 py-2.5 rounded-lg text-sm font-medium text-slate-300 bg-slate-700/50 hover:bg-slate-700 transition-colors border border-slate-600/50">
                Go to Another Servlet
            </a>
        </div>
    </div>
</body>
</html>
