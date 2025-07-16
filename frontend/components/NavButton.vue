<script setup>
import { defineProps, defineEmits, computed } from "vue";

const props = defineProps({
  label: String,
  curStore: String,
});

const emit = defineEmits(["update"]);

const isActive = computed(() => props.curStore === props.label);

function clickHandler() {
  emit("update", props.label);
}
</script>

<template>
  <button
    @click="clickHandler"
    :class="[
      'px-4 py-2 w-full text-center transition-colors duration-300 ',
      isActive ? 'shadow-[inset_-4px_0_0_0_#f43f5e] text-rose-500' : 'text-white',
      'hover:text-rose-500'
    ]"
  >
    {{ label }}
  </button>
</template>
