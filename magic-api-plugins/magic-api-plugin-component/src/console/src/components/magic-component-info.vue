<template>
	<div class="magic-component-info">
		<form>
			<label>{{ $i('component.form.name') }}</label>
			<magic-input v-model:value="info.name" :placeholder="$i('component.form.placeholder.name')" width="250px"/>
      <label>{{ $i('component.form.path') }}</label>
      <magic-input v-model:value="info.path" :placeholder="$i('component.form.placeholder.path')" width="auto" style="flex:1"/>
		</form>
		<div style="flex:1;padding-top:5px;">
			<magic-textarea v-model:value="info.description" :placeholder="$i('component.form.placeholder.description')"/>
		</div>
	</div>
</template>
<script setup>
import { inject } from 'vue'
const $i = inject('i18n.format')
const info = inject('info')
</script>
<style scoped>
.magic-component-info{
	display: flex;
	flex-direction: column;
	flex: 1;
	padding: 5px;
}
.magic-component-info form{
	display: flex;
}
.magic-component-info form label{
	display: inline-block;
	width: 75px;
	height: 22px;
	line-height: 22px;
	font-weight: 400;
	text-align: right;
	padding: 0 5px;
}
.magic-component-info form :deep(.magic-textarea){
	margin: 5px;
}
</style>
