<script setup>
import { ref } from 'vue'

const count = ref(0)
</script>

<template>
  <div class="min-h-screen flex flex-col items-center justify-center bg-gray-100 text-center">
    <h1 class="text-4xl font-bold mb-4 text-blue-600">Counter Page</h1>
    <p class="text-2xl mb-6">You clicked: <span class="font-mono">{{ count }}</span> times</p>
    <button
      class="px-6 py-3 bg-blue-500 hover:bg-blue-600 text-white font-semibold rounded-lg shadow-md transition"
      @click="count++"
    >
      Click Me!
    </button>
  </div>
</template>


