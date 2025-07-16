<script setup>
import { defineProps, defineEmits } from "vue";
import NavButton from "./NavButton.vue";

const props = defineProps({
	curStore: String,
});

const emit = defineEmits(["update-cur-store"]);

function handleUpdate(newStore) {
	emit("update-cur-store", newStore);
}
</script>

<template>
	<div class="relative flex flex-col bg-neutral-800 shadow-[0_8px_24px_rgba(0,0,0,0.4)] z-1000">
		<div class="bg-rose-500 w-60 h-60 flex justify-center items-center">
			<img src="/logo_small.svg" alt="Logo" />
		</div>
		<div class="flex flex-col flex-1 justify-between items-center">
			<div
				class="flex flex-col w-full divide-y divide-neutral-700 border-t border-b border-neutral-700"
			>
				<NavButton
					label="steam"
					:curStore="props.curStore"
					@update="handleUpdate"
				/>
				<NavButton
					label="playstation"
					:curStore="props.curStore"
					@update="handleUpdate"
				/>
				<NavButton
					label="nintendo switch"
					:curStore="props.curStore"
					@update="handleUpdate"
				/>
			</div>

			<img src="/logo_icon.svg" class="w-6 h-6" alt="Logo" />

			<div
				class="flex flex-col w-full divide-y divide-neutral-700 border-t border-b border-neutral-700"
			>
				<NavButton
					label="my keys"
					:curStore="props.curStore"
					@update="handleUpdate"
				/>
				<NavButton
					label="setting"
					:curStore="props.curStore"
					@update="handleUpdate"
				/>
				<NavButton
					label="logout"
					:curStore="props.curStore"
					@update="handleUpdate"
				/>
			</div>
		</div>
	</div>
</template>
