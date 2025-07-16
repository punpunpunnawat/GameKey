<script setup>
import { ref } from "vue";
import NavBar from "~/components/NavBar.vue";

const curStore = ref("steam");

function updateCurStore(newStore) {
	curStore.value = newStore;
}
</script>

<template>
	<div class="flex flex-row bg-neutral-700">
		<NavBar :curStore="curStore" @update-cur-store="updateCurStore" />
		<div
			class="min-h-screen w-full flex flex-col items-center justify-start text-center text-white"
		>
			<div
				class="flex flex-row w-full h-[400px] bg-rose-500 justify-evenly items-center"
			>
				<h1 class="text-8xl">STEAM GAMES</h1>
				<span
					>asdasdasddddddddddddddddddddddddd
					asdasdasddasdasdadasd</span
				>
			</div>

      <div class="flex flex-col p-12 g-16">
			<div>
				<h2 class="5xl">ALL GAMES</h2>
				<input />
			</div>
		</div>
		</div>
		
	</div>
</template>
