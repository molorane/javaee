<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jakarta EE Demo App</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body class="bg-slate-900 text-slate-100 min-h-screen flex flex-col justify-between font-sans">
    <!-- Common Header / Navigation Bar -->
    <header class="border-b border-slate-800 bg-slate-900/80 backdrop-blur sticky top-0 z-50">
        <div class="max-w-4xl mx-auto px-6 py-4 flex items-center justify-between">
            <a href="${pageContext.request.contextPath}" class="flex items-center gap-2 font-bold text-white text-lg tracking-tight hover:opacity-90 transition-opacity">
                <span class="w-3 h-3 rounded-full bg-indigo-500 badge-glow-indigo"></span>
                Jakarta EE Demo
            </a>
            <nav class="flex items-center gap-1.5 sm:gap-3 text-sm font-medium">
                <a href="${pageContext.request.contextPath}"
                   class="px-3 py-1.5 rounded-lg transition-all ${activeMenu == 'home' ? 'bg-indigo-600/30 text-white font-semibold border border-indigo-500/40 shadow-sm' : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/50'}">
                    Home
                </a>
                <a href="${pageContext.request.contextPath}/hello-servlet" 
                   class="px-3 py-1.5 rounded-lg transition-all ${activeMenu == 'hello' ? 'bg-indigo-600/30 text-indigo-300 font-semibold border border-indigo-500/40 shadow-sm' : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/50'}">
                    Hello Servlet
                </a>
                <a href="${pageContext.request.contextPath}/another-servlet" 
                   class="px-3 py-1.5 rounded-lg transition-all ${activeMenu == 'another' ? 'bg-purple-600/30 text-purple-300 font-semibold border border-purple-500/40 shadow-sm' : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/50'}">
                    Another Servlet
                </a>
            </nav>
        </div>
    </header>
