<template>
	<input v-model="email" type="email" placeholder="email" />
	<input v-model="password" type="password" placeholder="password" />
	<button @click="login">login</button>
</template>

<script setup>
import { ref } from "vue";

const email = ref("");
const password = ref("");

async function login() {
	try {
		const res = await fetch("http://localhost:8080/login", {
			method: "POST",
			headers: {
				"Content-Type": "application/json",
			},
			body: JSON.stringify({
				username: email.value,
				password: password.value,
			}),
		});

		if (!res.ok) {
			const errorText = await res.text();
			alert("Login failed: " + errorText);
			return;
		}

		const text = await res.text();
		alert("Login success: " + text);
	} catch (err) {
		alert("Error: " + err.message);
	}
}
</script>
